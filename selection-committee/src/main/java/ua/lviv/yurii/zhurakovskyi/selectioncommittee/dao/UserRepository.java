package ua.lviv.yurii.zhurakovskyi.selectioncommittee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	List<User> findByEmail(String email);

	UserDetails findByUsername(String username);
}
