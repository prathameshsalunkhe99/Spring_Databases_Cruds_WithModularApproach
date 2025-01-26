package com.jbk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.State;

@Repository
public class StateDao {
	@Autowired
	SessionFactory factory;

	public String insertData(State s) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		session.persist(s);
		tr.commit();
		session.close();
		return "Data inserted Sucessfully";
	}

	public String deleteData(int state_id) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		State s = session.get(State.class, state_id);
		session.remove(s);
		tr.commit();
		session.close();
		return "data is deleted Sucessfully";
	}

}
