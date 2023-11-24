package com.state;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Merge {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr1 = new FileReader("c:\\files\\array1.txt");
		FileReader fr2 = new FileReader("c:\\files\\array2.txt");
		
		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		
		String line1 = new String();
		String line2 = new String();
		
		while((line1 = br1.readLine()) != null) {
	
			list1.add(Integer.parseInt(line1));
		}
		
	
		
		while((line2 = br2.readLine()) != null) {
	
			list2.add(Integer.parseInt(line2));
		}
		
		
		ArrayList<Integer> list3 = new ArrayList<>();
		
		merge(list1, list2, list3);
		
		FileWriter fw = new FileWriter("c:\\files\\array3.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(int i : list3) {
			
			bw.write(Integer.toString(i));
			bw.newLine();
			
		}
		
		br2.close();
		br1.close();
		bw.close();
	}

	private static void merge(ArrayList<Integer> list1, ArrayList<Integer> list2, ArrayList<Integer> list3) {
		
		int i, j;
		
		i = 0;
		j = 0;
		
		while(i < list1.size() && j < list2.size()) {
			if(list1.get(i) < list2.get(j)) {
				list3.add(list1.get(i));
				i++;
			}else {
				list3.add(list2.get(j));
				j++;
			}
		}
		
		while(i < list1.size()) {
			list3.add(list1.get(i));
			i++;
		}
		
		while(j < list2.size()) {
			list3.add(list2.get(j));
			j++;
		}
		
	}
}
