package com.Test;

import java.util.Scanner;

import com.demo.beans.MyChar;

public class mainPerenthesis {
public static void main(String[] args) {
	System.out.println("enter String ");
	Scanner sc=new Scanner(System.in);
	String Str=sc.next();

	boolean status=balancedParenthesis(Str);
	if(status)
	{
		System.out.println("balance parenthesis");
	}
	else
	{
		System.out.println("unbalance");
	}
	
}

private static boolean balancedParenthesis(String str) {
	MyChar ob = new MyChar(str.length());
			for(int i = 0 ; i<str.length() ; i++)
			{
				char ch = str.charAt(i);
				if(ch == '(' || ch == '[' || ch == '{')
				{
					ob.push(ch);
				}
				else
				{
					if(ch==')' || ch == ']' || ch =='}')
					{
						if(!ob.isEmpty())
						{
							char ch1 = ob.pop();
							if((ch ==')' && ch1 != '(') || (ch == ']' && ch1 != '[') || (ch == '}' && ch1 != '{'))
							{
								return false;
							}
						}
						else
						{
							return false;
						}
					}
					
				}
			
			}
			
			
			if(ob.isEmpty())
			{
				return true;
			}
			else
			{
				while(!ob.isEmpty())
				{
					System.out.println(ob.pop());
				}
				return false;
			}
}
}
