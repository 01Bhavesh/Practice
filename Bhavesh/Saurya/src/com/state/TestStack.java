package com.state;

public class TestStack {
	
	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		while( !stack.isEmpty() ) {
		
			System.out.println(stack.pop());
		}
	}
}
