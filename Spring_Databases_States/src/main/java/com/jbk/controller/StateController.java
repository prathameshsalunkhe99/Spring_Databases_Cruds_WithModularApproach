package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.State;
import com.jbk.service.StateService;

@RestController

public class StateController {
	@Autowired
	StateService service;

	@PostMapping("/saveData")
	public String insertdata(@RequestBody State s) {
		String msg = service.insertData(s);
		return msg;
	}

	@DeleteMapping("/deleteData/{state_id}")
	public String deleteData(@PathVariable int state_id) {
		String msg = service.deleteData(state_id);
		return msg;

	}
}
