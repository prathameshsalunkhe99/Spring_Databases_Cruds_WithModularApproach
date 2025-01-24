package com.jbk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Countries;

@Repository
public class CountriesDao {
	@Autowired
	SessionFactory factory;

	public String insertData(Countries c) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		session.persist(c);
		tr.commit();
		session.close();
		return "Data inserted Sucessfully";

	}
}
