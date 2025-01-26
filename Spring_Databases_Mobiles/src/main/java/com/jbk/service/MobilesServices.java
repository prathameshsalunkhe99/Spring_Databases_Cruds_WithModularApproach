package com.jbk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.MobilesDao;
import com.jbk.entity.Mobiles;

@Service
public class MobilesServices {
	@Autowired
	MobilesDao dao;

	public String insertData(Mobiles m) {
		String msg = dao.incertData(m);
		return msg;
	}

	public String deleteData(int mobile_id) {
		String msg = dao.deleteData(mobile_id);
		return msg;

	}

}
