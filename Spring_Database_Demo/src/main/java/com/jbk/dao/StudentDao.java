package com.jbk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jbk.entity.Student;

@Repository
public class StudentDao {
	@Autowired
	SessionFactory factory;

	public String insertData(Student s) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		session.persist(s);
		tr.commit();
		session.close();
		return " Data is inserted";
	}

}
