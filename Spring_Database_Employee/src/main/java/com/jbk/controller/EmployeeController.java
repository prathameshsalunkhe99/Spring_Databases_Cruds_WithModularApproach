package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@DeleteMapping("/deleteData/{emp_id}")
	public String deleteData(@PathVariable int emp_id) {
		String msg = service.DeleteData(emp_id);
		return msg;

	}
}
