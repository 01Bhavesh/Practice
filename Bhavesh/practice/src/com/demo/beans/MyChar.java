package com.demo.beans;

public class MyChar {
	private char[] arr;
	private int size;
	private int top;
	public MyChar() {
		arr = new char[20];
		size = 20;
		top = -1;
	}
	public MyChar(int n) {
		arr = new char[n];
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
	public boolean push(char ch)
	{
		if(isFull())
		{
			System.out.println("stack is full");
			return false;
		}
		else
		{
			arr[++top] = ch;
			return true;
		}
	}
	public char pop()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
			return '#';
		}
		else
		{
			char ch = arr[top--];
			return ch;
		}
	}
	
}
