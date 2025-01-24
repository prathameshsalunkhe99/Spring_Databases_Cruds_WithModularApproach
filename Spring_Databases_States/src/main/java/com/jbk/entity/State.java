package com.jbk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class State {
	@Id
	private int state_ID;
	private String state_name;
	private String state_polulation;
	private String state_gdp;
	private String state_leader;
	private String state_language;

	public State() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getState_ID() {
		return state_ID;
	}

	public void setState_ID(int state_ID) {
		this.state_ID = state_ID;
	}

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
	}

	public String getState_polulation() {
		return state_polulation;
	}

	public void setState_polulation(String state_polulation) {
		this.state_polulation = state_polulation;
	}

	public String getState_gdp() {
		return state_gdp;
	}

	public void setState_gdp(String state_gdp) {
		this.state_gdp = state_gdp;
	}

	public String getState_leader() {
		return state_leader;
	}

	public void setState_leader(String state_leader) {
		this.state_leader = state_leader;
	}

	public String getState_language() {
		return state_language;
	}

	public void setState_language(String state_language) {
		this.state_language = state_language;
	}

	public State(int state_ID, String state_name, String state_polulation, String state_gdp, String state_leader,
			String state_language) {
		super();
		this.state_ID = state_ID;
		this.state_name = state_name;
		this.state_polulation = state_polulation;
		this.state_gdp = state_gdp;
		this.state_leader = state_leader;
		this.state_language = state_language;
	}

	@Override
	public String toString() {
		return "State [state_ID=" + state_ID + ", state_name=" + state_name + ", state_polulation=" + state_polulation
				+ ", state_gdp=" + state_gdp + ", state_leader=" + state_leader + ", state_language=" + state_language
				+ "]";
	}

}
