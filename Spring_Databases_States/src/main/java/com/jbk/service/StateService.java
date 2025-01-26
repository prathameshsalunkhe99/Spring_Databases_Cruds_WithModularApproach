package com.jbk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.StateDao;
import com.jbk.entity.State;

@Service
public class StateService {
	@Autowired
	StateDao dao;

	public String insertData(State s) {
		String msg = dao.insertData(s);
		return msg;
	}

	public String deleteData(int stste_id) {
		String msg = dao.deleteData(stste_id);
		return msg;
	}

}
