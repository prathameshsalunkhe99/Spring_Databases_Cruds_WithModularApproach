package com.jbk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mobiles {
	@Id
	public int mob_id;
	public String mob_name;
	public String mob_brand;
	public int mob_price;
	public String mob_ram;
	public String mob_rom;
	public String mob_camera;
	public String mob_battry;
	public String mob_os;

	public Mobiles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMob_id() {
		return mob_id;
	}

	public void setMob_id(int mob_id) {
		this.mob_id = mob_id;
	}

	public String getMob_name() {
		return mob_name;
	}

	public void setMob_name(String mob_name) {
		this.mob_name = mob_name;
	}

	public String getMob_brand() {
		return mob_brand;
	}

	public void setMob_brand(String mob_brand) {
		this.mob_brand = mob_brand;
	}

	public int getMob_price() {
		return mob_price;
	}

	public void setMob_price(int mob_price) {
		this.mob_price = mob_price;
	}

	public String getMob_ram() {
		return mob_ram;
	}

	public void setMob_ram(String mob_ram) {
		this.mob_ram = mob_ram;
	}

	public String getMob_rom() {
		return mob_rom;
	}

	public void setMob_rom(String mob_rom) {
		this.mob_rom = mob_rom;
	}

	public String getMob_camera() {
		return mob_camera;
	}

	public void setMob_camera(String mob_camera) {
		this.mob_camera = mob_camera;
	}

	public String getMob_battry() {
		return mob_battry;
	}

	public void setMob_battry(String mob_battry) {
		this.mob_battry = mob_battry;
	}

	public String getMob_os() {
		return mob_os;
	}

	public void setMob_os(String mob_os) {
		this.mob_os = mob_os;
	}

	public Mobiles(int mob_id, String mob_name, String mob_brand, int mob_price, String mob_ram, String mob_rom,
			String mob_camera, String mob_battry, String mob_os) {
		super();
		this.mob_id = mob_id;
		this.mob_name = mob_name;
		this.mob_brand = mob_brand;
		this.mob_price = mob_price;
		this.mob_ram = mob_ram;
		this.mob_rom = mob_rom;
		this.mob_camera = mob_camera;
		this.mob_battry = mob_battry;
		this.mob_os = mob_os;
	}

	@Override
	public String toString() {
		return "Mobiles [mob_id=" + mob_id + ", mob_name=" + mob_name + ", mob_brand=" + mob_brand + ", mob_price="
				+ mob_price + ", mob_ram=" + mob_ram + ", mob_rom=" + mob_rom + ", mob_camera=" + mob_camera
				+ ", mob_battry=" + mob_battry + ", mob_os=" + mob_os + "]";
	}

}
