package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Mobiles;
import com.jbk.service.MobilesServices;

@RestController
public class MobileController {
	@Autowired

	MobilesServices services;

	@PostMapping("/saveData")
	public String insertData(@RequestBody Mobiles m) {
		String msg = services.insertData(m);
		return msg;
	}

	@DeleteMapping("/deleteData/{mobile_id}")
	public String deleteData(@PathVariable int mobile_id) {
		String msg = services.deleteData(mobile_id);
		return msg;
	}
}
