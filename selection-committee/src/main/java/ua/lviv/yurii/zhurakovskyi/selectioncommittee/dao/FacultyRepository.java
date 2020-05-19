package ua.lviv.yurii.zhurakovskyi.selectioncommittee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {

}
