package com.jbk.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
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

	public String deleteData(int stud_id) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Student s1 = session.get(Student.class, stud_id);
		session.remove(s1);
		tr.commit();
		session.close();
		return "Data is Deleted Sucessfully";

	}

	public String updateData(int stud_id, Student updateStudent) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Student s = session.get(Student.class, stud_id);
		s.setStud_name(updateStudent.getStud_name());
		s.setStud_city(updateStudent.getStud_city());
		session.merge(s);
		tr.commit();
		session.close();
		return "Data is udated sucessfully";

	}

	public Student getSingleRecord(int stud_id) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		String hqlQuery = "from Student where stud_id=:myid";
		Query<Student> query = session.createQuery(hqlQuery, Student.class);
		query.setParameter("myid",stud_id);
		Student s=query.uniqueResult();
		tr.commit();
		session.close();
		return s;

	}

	public List<Student> getAllRecord() {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		String hqlQuery = "from Student";
		Query<Student> query = session.createQuery(hqlQuery, Student.class);
		List<Student> list = query.getResultList();

		tr.commit();
		session.close();
		return list;
	}

}
