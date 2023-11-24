package com.state;

public class MyStack {
	
	int[] arr;
	int top;
	int size;
	
	public MyStack() {
		arr = new int[10];
		top = -1;
		size = 10;
	}
	
	public MyStack(int n) {
		arr = new int[n];
		top = -1;
		size = n;
	}
	
	public boolean isEmpty() {
		
		return top == -1;
	}
	
	public boolean isFull() {
		
		return top == size - 1;
	}
	
	public boolean push(int n) {
		
		if(isFull()) {
			System.out.println("stack overflow");
			return false;
			
		}else {
			top++;
			arr[top] = n;
			return true;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack underflow");
			return -1;
		}
		return arr[top--];
	
	}
}
