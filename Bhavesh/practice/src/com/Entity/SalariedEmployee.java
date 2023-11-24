package com.Entity;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{
	
		private double salary;
		private double bonus;
		
		
		
		public SalariedEmployee(int id, String name, LocalDate dateOfJoining, double salary, double bonus) {
			super(id, name, dateOfJoining);
			this.salary = salary;
			this.bonus = bonus;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public double getBonus() {
			return bonus;
		}
		public void setBonus(float bonus) {
			this.bonus = bonus;
		}
		
		@Override
		public String toString() {
			super.toString();
			return "SalariedEmployee [salary=" + salary + ", bonus=" + bonus + "]";
		}	
	
}
