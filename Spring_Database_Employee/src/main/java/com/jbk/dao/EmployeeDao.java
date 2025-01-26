package com.jbk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Employee;

@Repository
public class EmployeeDao {
	@Autowired
	SessionFactory factory;

	public String insertData(Employee e) {

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		session.persist(e);
		tr.commit();
		session.close();
		return "Data is inserted";
	}
	public String daleteData(int emp_id) {
		Session session =factory.openSession();
		Transaction tr=session.beginTransaction();
		Employee e1= session.get(Employee.class, emp_id);
		session.remove(e1);
		tr.commit();
		session.close();
		return"Data deleted Sucessfully";
		
		
	}

}
