package ua.lviv.yurii.zhurakovskyi.selectioncommittee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain.Faculty;
import ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain.User;
import ua.lviv.yurii.zhurakovskyi.selectioncommittee.security.service.FacultyService;
import ua.lviv.yurii.zhurakovskyi.selectioncommittee.security.service.impl.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private UserServiceImpl userService;
	@Autowired
	private FacultyService facultyService;

	@PostMapping(value = "/saveUser")
	public String loginCombination(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		System.out.println(username);
		System.out.println(password);
		User user = new User();
		user.setUsername(username);
		user.setPassword(passwordEncoder.encode(password));
		userService.save(user);
		return "login";
	}

	@PostMapping("/successURL")
	public String successURL(Model model) {

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName();
		if (username.equals("admin")) {
			model.addAttribute("userLogged", "ADMIN logged");
		} else {
			User userLogged = (User) userService.loadUserByUsername(username);
			System.out.println(userLogged.getUsername());
			System.out.println(userLogged.getPassword());
			model.addAttribute("userLogged", userLogged.getUsername());
		}
		return "home";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView welcome(Model model) {
		System.out.println("Hello from home!!");
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("faculties", facultyService.getAllFaculties());
		System.out.println(facultyService.getAllFaculties());
		return modelAndView;
	}

	@RequestMapping(value = "/apply", method = RequestMethod.GET)
	public String applyEntrant(Model model) {
		return "home";
	}

	@RequestMapping(value = "/createFaculty", method = RequestMethod.GET)
	public ModelAndView createFaculty() {
		return new ModelAndView("createFaculty", "faculty", new Faculty());
	}
}
