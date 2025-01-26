package com.jbk.SpringBootAllCrudOperations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.SpringBootAllCrudOperations.dao.StudentDao;
import com.jbk.SpringBootAllCrudOperations.entity.Student;



@Service
public class StudentService {
	@Autowired
	StudentDao dao;

	public String insertData(Student s) {
		String msg = dao.insertData(s);
		return msg;
	}

	public String deleteData(int stud_id) {
		String msg = dao.deleteData(stud_id);
		return msg;
	}

	public String updateData(int stud_id, Student updateData) {
		String msg = dao.updateData(stud_id, updateData);
		return msg;
	}

	public List<Student> getAllRecord() {
		return dao.getAllRecord();

	}

}
