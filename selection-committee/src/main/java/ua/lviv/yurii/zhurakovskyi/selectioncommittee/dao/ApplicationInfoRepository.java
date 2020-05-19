package ua.lviv.yurii.zhurakovskyi.selectioncommittee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain.ApplicationInfo;

public interface ApplicationInfoRepository extends JpaRepository<ApplicationInfo, Integer> {

}
