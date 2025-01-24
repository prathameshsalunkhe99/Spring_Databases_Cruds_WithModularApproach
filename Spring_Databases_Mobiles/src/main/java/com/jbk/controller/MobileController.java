package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
        String msg=services.insertData(m);
		return msg;
	}
}
