package com.Test;

import java.util.Scanner;

import com.demo.beans.MyString;

public class mainString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter string");
	String str = sc.nextLine();
	mainString str1 = new mainString();
	str1.pushIntoStack(str);
}

private void pushIntoStack(String str) {
	int j = 1;
	for(int i = 0 ; i<str.length() ;i++)
	{
		if(str.charAt(i) == ' ')
		{
			j++;
		}
	}
	MyString ob = new MyString(j);
	String[] st = str.split(" ");
	for(int i = 0 ; i<j ;i++)
	{
		ob.push(st[i]);
	}
	
	
	while(!ob.isEmpty())
	{
		System.out.print(ob.pop()+" ");
	}
}


}
