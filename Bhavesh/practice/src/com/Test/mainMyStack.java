package com.Test;

import com.demo.beans.MyStack;

public class mainMyStack {
	static MyStack stk = new MyStack(5);
public static void main(String[] args) {
	
	System.out.println(stk.pop());
	stk.push(4);
	stk.push(8);
	stk.push(2);
	stk.push(8);
	stk.push(6);
//	while(!stk.isEmpty())
//	{
//		System.out.println(stk.pop());
//	}
	reversStack();
}
static public void reversStack()
{
	if(stk.isEmpty())
	{
		System.out.println("stack is empty");
	}
	else
	{
		int[] arr1 = new int[stk.getSize()]; 
		int i = 0; 
		while(!stk.isEmpty())
		{
			
			arr1[i++] = stk.pop();
		}
	
		for(int j = i-1 ; j>=0 ; j--)
		{
			System.out.println(arr1[j]);
		}
	}
}
}
