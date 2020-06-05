package ua.lviv.yurii.zhurakovskyi.selectioncommittee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain.Certificate;

@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Integer> {
	Certificate findByApplicant(Integer applicantId);
}
