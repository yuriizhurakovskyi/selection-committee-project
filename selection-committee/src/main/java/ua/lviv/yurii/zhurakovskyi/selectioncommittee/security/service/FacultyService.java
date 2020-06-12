package ua.lviv.yurii.zhurakovskyi.selectioncommittee.security.service;

import java.util.List;

import ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain.Faculty;

public interface FacultyService {
	void save(Faculty faculty);

	List<Faculty> getAllFaculties();
}
