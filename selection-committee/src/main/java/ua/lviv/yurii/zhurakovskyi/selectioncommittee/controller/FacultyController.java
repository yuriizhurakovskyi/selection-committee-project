package ua.lviv.yurii.zhurakovskyi.selectioncommittee.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain.Faculty;
import ua.lviv.yurii.zhurakovskyi.selectioncommittee.security.service.impl.FacultyServiceImpl;

@Controller
public class FacultyController {
	private final FacultyServiceImpl facultyService;

	@Autowired
	public FacultyController(FacultyServiceImpl facultyService) {
		this.facultyService = facultyService;
	}

	@RequestMapping(value = "/createFaculty", method = RequestMethod.POST)
	public String createFaculty(@Valid @ModelAttribute("faculty") Faculty faculty, BindingResult bindingResult) {
		facultyService.save(faculty);
		return "/home";
	}
}
