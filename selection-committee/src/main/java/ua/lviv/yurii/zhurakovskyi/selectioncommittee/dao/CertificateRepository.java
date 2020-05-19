package ua.lviv.yurii.zhurakovskyi.selectioncommittee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Integer> {
	Certificate findByApplicant(Integer id);
}
