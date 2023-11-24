package com.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class empServiceImp implements empService{

	@Override
	public void addEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println("enter date in form of (dd/mm/yyyy)");
		String dt = sc.nextLine();
		LocalDate doj = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
	}

}
