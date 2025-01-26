package com.jbk.SpringBootAllCrudOperations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.SpringBootAllCrudOperations.entity.Student;
import com.jbk.SpringBootAllCrudOperations.service.StudentService;


@RestController
public class StudentController {
	@Autowired
	StudentService service;

	@PostMapping("/saveData")
	public String intertdata(@RequestBody Student s) {
		String msg = service.insertData(s);
		return msg;
	}

	@DeleteMapping("/deleteData/{stud_id}")
	public String deleteData(@PathVariable int stud_id) {
		String msg = service.deleteData(stud_id);
		return msg;

	}

	@PutMapping("/updateData/{stud_id}")
	public String updtate(@PathVariable int stud_id, @RequestBody Student updateData) {
		String msg = service.updateData(stud_id, updateData);
		return msg;
	}

	@GetMapping("/getAllRecord")
	public List<Student> getAllRecord() {
		return service.getAllRecord();

	}
}

