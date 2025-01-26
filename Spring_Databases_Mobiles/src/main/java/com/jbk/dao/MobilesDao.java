package com.jbk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Mobiles;

@Repository
public class MobilesDao {
	@Autowired
	SessionFactory factory;

	public String incertData(Mobiles m) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		session.persist(m);
		tr.commit();
		session.close();
		return "Data is Inserted Sucessfully";
	}

	public String deleteData(int mobile_id) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Mobiles m = session.get(Mobiles.class, mobile_id);
		session.remove(m);
		tr.commit();
		session.close();
		return "Data is Deleted Sucessfully";

	}

}
