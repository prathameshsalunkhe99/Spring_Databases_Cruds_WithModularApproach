package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Cars;
import com.jbk.service.CarsService;

@RestController
public class CarsController {
	@Autowired
	CarsService service;
	
	@PostMapping("/saveData")
	public String insertdata(@RequestBody Cars c) {
		String msg=service.insertData(c);
		return msg;
		
	}

}
