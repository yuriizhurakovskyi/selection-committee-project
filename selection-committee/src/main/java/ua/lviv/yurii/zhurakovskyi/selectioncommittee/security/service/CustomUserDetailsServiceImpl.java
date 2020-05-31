package ua.lviv.yurii.zhurakovskyi.selectioncommittee.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ua.lviv.yurii.zhurakovskyi.selectioncommittee.dao.UserRepository;
import ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain.User;

@Service
public class CustomUserDetailsServiceImpl implements CustomUserDetailsService {

	private final UserRepository userRepository;

	@Autowired
	public CustomUserDetailsServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void save(User user) {
		if (user != null)
			userRepository.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userRepository.findByUsername(username);
	}
}
