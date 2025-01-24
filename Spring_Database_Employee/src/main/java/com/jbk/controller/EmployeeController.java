package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Employee;
import com.jbk.service.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
@PostMapping("/saveData")
	public String insterdata(@RequestBody Employee e) {
		String msg = service.insertData(e);
		return msg;

	}

}
