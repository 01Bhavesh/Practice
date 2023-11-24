package com.Entity;

import java.time.LocalDate;

public class ContractEmployee extends Employee {
		
	private double charge;
	private int year;
	
	public ContractEmployee(int id, String name, LocalDate dateOfJoining, double charge, int year) {
		
		super(id, name, dateOfJoining);
		
		this.charge = charge;
		this.year = year;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		super.toString();
		return "ContractEmployee [charge=" + charge + ", year=" + year + "]";
	}
	
	
}
