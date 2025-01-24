package com.jbk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private int emp_id;
	private String emp_name;
	private String emp_city;
	private String emp_dept;
	private int emp_salary;
	private long emp_mob_no;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_city() {
		return emp_city;
	}

	public void setEmp_city(String emp_city) {
		this.emp_city = emp_city;
	}

	public String getEmp_dept() {
		return emp_dept;
	}

	public void setEmp_dept(String emp_dept) {
		this.emp_dept = emp_dept;
	}

	public int getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}

	public long getEmp_mob_no() {
		return emp_mob_no;
	}

	public void setEmp_mob_no(long emp_mob_no) {
		this.emp_mob_no = emp_mob_no;
	}

	public Employee(int emp_id, String emp_name, String emp_city, String emp_dept, int emp_salary, long emp_mob_no) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_city = emp_city;
		this.emp_dept = emp_dept;
		this.emp_salary = emp_salary;
		this.emp_mob_no = emp_mob_no;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_city=" + emp_city + ", emp_dept="
				+ emp_dept + ", emp_salary=" + emp_salary + ", emp_mob_no=" + emp_mob_no + "]";
	}

}
