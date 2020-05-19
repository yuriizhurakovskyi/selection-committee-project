package ua.lviv.yurii.zhurakovskyi.selectioncommittee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain.Direction;

public interface DirectionRepository extends JpaRepository<Direction, Integer> {
	List<Direction> findByFaculty(Integer facultyId);
}
