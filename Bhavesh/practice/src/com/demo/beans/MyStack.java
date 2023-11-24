package com.demo.beans;

public class MyStack {
private int[] arr;
private int size;
private int top;

public MyStack() {
	arr = new int[10];
	size = 10;
	top = -1;
}

public MyStack(int n) {
	arr = new int[n];
	size = n;
	top = -1;
}

public int getSize() {
	return size;
}

public void setSize(int size) {
	this.size = size;
}

public boolean isEmpty(){
	return top == -1;
}
public boolean isFull()
{
	return top == size-1;
}
public boolean push(int n)
{
	if(isFull())
	{
		System.out.println("stack is full");
		return false;
	}
	else
	{
		top++;
		arr[top] = n;
		return true;
	}
}
public int pop()
{
	if(isEmpty())
	{
		System.out.println("stack is empty");
		return -1;
	}
	else
	{
		int num = arr[top];
		top--;
		return num;
	}
}

}
