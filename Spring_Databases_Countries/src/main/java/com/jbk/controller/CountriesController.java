package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Countries;
import com.jbk.service.CountriesService;
@RestController
public class CountriesController {
	@Autowired
	CountriesService service;

	@PostMapping("/saveData")
	public String insertdata(@RequestBody Countries c) {
		String msg = service.insertData(c);
		return msg;

	}

}
