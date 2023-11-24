package com.Entity;

import java.time.LocalDate;

public class Employee {
	
	private int id;
	private String name;
	private LocalDate dateOfJoining;
	
	public Employee(int id, String name, LocalDate dateOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfJoining = dateOfJoining;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dateOfJoining=" + dateOfJoining + "]";
	}
	
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
}
