package com.jbk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Countries {
	@Id
	private int country_Id;
    private String country_Name;
    private String country_Population;
    private String country_GDP;
    private String country_Army;
    private String country_Leader;
    private String country_Army_count;
    private String country_Currency;
	public Countries() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCountry_Id() {
		return country_Id;
	}
	public void setCountry_Id(int country_Id) {
		this.country_Id = country_Id;
	}
	public String getCountry_Name() {
		return country_Name;
	}
	public void setCountry_Name(String country_Name) {
		this.country_Name = country_Name;
	}
	public String getCountry_Population() {
		return country_Population;
	}
	public void setCountry_Population(String country_Population) {
		this.country_Population = country_Population;
	}
	public String getCountry_GDP() {
		return country_GDP;
	}
	public void setCountry_GDP(String country_GDP) {
		this.country_GDP = country_GDP;
	}
	public String getCountry_Army() {
		return country_Army;
	}
	public void setCountry_Army(String country_Army) {
		this.country_Army = country_Army;
	}
	public String getCountry_Leader() {
		return country_Leader;
	}
	public void setCountry_Leader(String country_Leader) {
		this.country_Leader = country_Leader;
	}
	public String getCountry_Army_count() {
		return country_Army_count;
	}
	public void setCountry_Army_count(String country_Army_count) {
		this.country_Army_count = country_Army_count;
	}
	public String getCountry_Currency() {
		return country_Currency;
	}
	public void setCountry_Currency(String country_Currency) {
		this.country_Currency = country_Currency;
	}
	public Countries(int country_Id, String country_Name, String country_Population, String country_GDP,
			String country_Army, String country_Leader, String country_Army_count, String country_Currency) {
		super();
		this.country_Id = country_Id;
		this.country_Name = country_Name;
		this.country_Population = country_Population;
		this.country_GDP = country_GDP;
		this.country_Army = country_Army;
		this.country_Leader = country_Leader;
		this.country_Army_count = country_Army_count;
		this.country_Currency = country_Currency;
	}
	@Override
	public String toString() {
		return "Countries [country_Id=" + country_Id + ", country_Name=" + country_Name + ", country_Population="
				+ country_Population + ", country_GDP=" + country_GDP + ", country_Army=" + country_Army
				+ ", country_Leader=" + country_Leader + ", country_Army_count=" + country_Army_count
				+ ", country_Currency=" + country_Currency + "]";
	}
    
    
    
}