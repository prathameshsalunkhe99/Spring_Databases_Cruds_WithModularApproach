package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Student;
import com.jbk.service.StudentService; 

@RestController
public class StudentController {
	@Autowired
	StudentService service;

	@PostMapping("/saveData")
	public String intertdata(@RequestBody Student s) {
		String msg = service.insertData(s);
		return msg;
	}
}
