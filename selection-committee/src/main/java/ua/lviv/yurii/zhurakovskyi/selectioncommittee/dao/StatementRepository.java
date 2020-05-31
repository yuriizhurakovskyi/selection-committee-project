package ua.lviv.yurii.zhurakovskyi.selectioncommittee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain.Statement;

@Repository
public interface StatementRepository extends JpaRepository<Statement, Integer> {

}
