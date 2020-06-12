package ua.lviv.yurii.zhurakovskyi.selectioncommittee.security.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.yurii.zhurakovskyi.selectioncommittee.dao.FacultyRepository;
import ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain.Faculty;
import ua.lviv.yurii.zhurakovskyi.selectioncommittee.security.service.FacultyService;

@Service
public class FacultyServiceImpl implements FacultyService {
	private final FacultyRepository facultyRepository;

	@Autowired
	public FacultyServiceImpl(FacultyRepository facultyRepository) {
		this.facultyRepository = facultyRepository;
	}

	@Override
	public void save(Faculty faculty) {
		if (faculty != null)
			facultyRepository.save(faculty);
	}

	@Override
	public List<Faculty> getAllFaculties() {
		return facultyRepository.findAll();
	}

}
