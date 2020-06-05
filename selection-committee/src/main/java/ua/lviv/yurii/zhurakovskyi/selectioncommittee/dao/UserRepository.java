package ua.lviv.yurii.zhurakovskyi.selectioncommittee.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);
	Optional<User> findByEmail(String email);
}
