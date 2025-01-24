package com.jbk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.CountriesDao;
import com.jbk.entity.Countries;

@Service
public class CountriesService {
	@Autowired
	CountriesDao dao;
 
	public String insertData(Countries c) {
		String msg =dao.insertData(c);
		return msg;
		
		
	}
}
