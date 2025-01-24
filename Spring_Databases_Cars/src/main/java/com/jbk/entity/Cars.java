package com.jbk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cars {
	@Id
	public int car_id;
	public String car_name;
	public String car_companies;
	public String engine_type;
	public String car_milage;
	public String car_price;
	public String car_color;

	public Cars() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	public String getCar_name() {
		return car_name;
	}

	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	public String getCar_companies() {
		return car_companies;
	}

	public void setCar_companies(String car_companies) {
		this.car_companies = car_companies;
	}

	public String getEngine_type() {
		return engine_type;
	}

	public void setEngine_type(String engine_type) {
		this.engine_type = engine_type;
	}

	public String getCar_milage() {
		return car_milage;
	}

	public void setCar_milage(String car_milage) {
		this.car_milage = car_milage;
	}

	public String getCar_price() {
		return car_price;
	}

	public void setCar_price(String car_price) {
		this.car_price = car_price;
	}

	public String getCar_color() {
		return car_color;
	}

	public void setCar_color(String car_color) {
		this.car_color = car_color;
	}

	public Cars(int car_id, String car_name, String car_companies, String engine_type, String car_milage,
			String car_price, String car_color) {
		super();
		this.car_id = car_id;
		this.car_name = car_name;
		this.car_companies = car_companies;
		this.engine_type = engine_type;
		this.car_milage = car_milage;
		this.car_price = car_price;
		this.car_color = car_color;
	}

	@Override
	public String toString() {
		return "Cars [car_id=" + car_id + ", car_name=" + car_name + ", car_companies=" + car_companies
				+ ", engine_type=" + engine_type + ", car_milage=" + car_milage + ", car_price=" + car_price
				+ ", car_color=" + car_color + "]";
	}

}
