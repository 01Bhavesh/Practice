package com.demo.beans;

public class MyString {

	private String[] arr;
	private int size;
	private int top;
	public MyString() {
		arr = new String[20];
		size = 20;
		top = -1;
	}
	public MyString(int n) {
		arr = new String[n];
		size = n;
		top = -1;
	}
	public boolean isEmpty() 
	{
		return top == -1;
	}
	public boolean isFull()
	{
		return top == size-1;
	}
	public boolean push(String str)
	{
		if(isFull())
		{
			System.out.println("stack is full");
			return false;
		}
		else
		{
			arr[++top] = str;
			return true;
		}
	}
	public String pop()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
			return "Empty";
		}
		else
		{
			String str = arr[top--];
			return str;
		}
	}
}
