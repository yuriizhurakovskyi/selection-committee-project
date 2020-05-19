package ua.lviv.yurii.zhurakovskyi.selectioncommittee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain.Statement;

public interface StatementRepository extends JpaRepository<Statement, Integer> {
	
}
