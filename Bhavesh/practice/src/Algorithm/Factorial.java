package Algorithm;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number : ");
	int num = sc.nextInt();
	int fact = factorial(num);
	System.out.println("factorial "+fact);
}
public static int factorial(int num)
{
	if(num<1)
	{
		return 1;
	}
	return num*factorial(num-1);
	
}
}
