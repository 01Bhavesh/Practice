package com.state;

import java.io.File;
import java.io.IOException;

public class Prac {
	
	public static void main(String[] args) throws IOException {
		
		int count = 0;
		
		File f = new File("C:\\files");
		
		String[] s = f.list();
		
		for(String s1 : s) {
			
			File f1 = new File(f, s1);
			
			if(f1.isFile()) {
				count++;
				System.out.println(s1);
			}
		
		}
		
		System.out.println(count);
	}
}
