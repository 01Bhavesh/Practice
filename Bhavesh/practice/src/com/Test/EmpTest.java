package com.Test;

import java.util.Scanner;

import com.Service.empService;
import com.Service.empServiceImp;

public class EmpTest {
	public static void main(String[] args) {
		empService emp = new empServiceImp();
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("1. addEmp/n2. displayAll/n3. exit/nchoice :");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				emp.addEmp();
				break;
			case 2:
				break;
			case 3:
				System.out.println("thanke you");
				sc.close();
				break;
				default :
					System.out.println("data is not correct");
					break;
			}
		}while(true);
	}
}
