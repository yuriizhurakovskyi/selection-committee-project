package ua.lviv.yurii.zhurakovskyi.selectioncommittee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

}
