package ua.lviv.yurii.zhurakovskyi.selectioncommittee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain.User;
import ua.lviv.yurii.zhurakovskyi.selectioncommittee.security.service.CustomUserDetailsServiceImpl;

@Controller
public class UserController {

	private final PasswordEncoder passwordEncoder;
	private final CustomUserDetailsServiceImpl userService;

	@Autowired
	public UserController(PasswordEncoder passwordEncoder, CustomUserDetailsServiceImpl userService) {
		this.passwordEncoder = passwordEncoder;
		this.userService = userService;
	}

	@PostMapping("/register")
	public String loginCombination(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(passwordEncoder.encode(password));
		userService.save(user);
		return "login";
	}

	@PostMapping("/success")
	public String successURL(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName();
		if (username.equals("admin")) {
			model.addAttribute("loggedUser", "Admin logged");
		} else {
			User loggedUser = (User) userService.loadUserByUsername(username);
			model.addAttribute("loggedUser", loggedUser.getUsername());
		}
		return "welcome";
	}
}
