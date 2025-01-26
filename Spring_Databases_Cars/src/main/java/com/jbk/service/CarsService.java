package com.jbk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.CarsDao;
import com.jbk.entity.Cars;

@Service
public class CarsService {
	@Autowired
	CarsDao dao;

	public String insertData(Cars c) {
		String msg = dao.insertData(c);
		return msg;
	}

	public String deleteData(int car_id) {
		String msg = dao.deleteData(car_id);
		return msg;
	}
}
