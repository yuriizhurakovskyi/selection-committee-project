package ua.lviv.yurii.zhurakovskyi.selectioncommittee.security.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain.User;

public interface CustomUserDetailsService extends UserDetailsService {
	void save(User user);

	public UserDetails loadUserByUsername(String username);
}
