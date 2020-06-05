package ua.lviv.yurii.zhurakovskyi.selectioncommittee.controller;

import ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain.User;
import ua.lviv.yurii.zhurakovskyi.selectioncommittee.security.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

	private final PasswordEncoder passwordEncoder;
	private final UserServiceImpl userService;

	@Autowired
	public UserController(PasswordEncoder passwordEncoder, UserServiceImpl userService) {
		this.passwordEncoder = passwordEncoder;
		this.userService = userService;
	}

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
}
