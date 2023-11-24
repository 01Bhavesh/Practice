package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileMerge {
 public static void main(String[] args) throws IOException {
	
	 {
		BufferedReader br1 = new BufferedReader (new FileReader("file1.txt"));
		BufferedReader br2 = new BufferedReader (new FileReader("file2.txt"));
		
		ArrayList<Integer> lst1 = new ArrayList<>();
		ArrayList<Integer> lst2 = new ArrayList<>();
		
		String line1 = new String();
		String line2 = new String();
		
		while((line1 = br1.readLine())!=null)
		{
			lst1.add(Integer.parseInt(line1));
		}
		while((line2 = br2.readLine())!=null)
		{
			lst2.add(Integer.parseInt(line2));
		}
		
		ArrayList<Integer> lst3 = new ArrayList<>();
		
		merge(lst1,lst2,lst3);
		
		BufferedWriter bw1 = new BufferedWriter (new FileWriter("file3.txt"));
		
		for(int i : lst3)
		{
			bw1.write(Integer.toString(i));
			bw1.newLine();
		}
		
		br2.close();
		br1.close();
		bw1.close();
 	} 
	}

private static void merge(ArrayList<Integer> lst1, ArrayList<Integer> lst2, ArrayList<Integer> lst3) {
		int n1 = lst1.size();
		int n2 = lst2.size();
		
		int i = 0;
		int j = 0;
		
		while(i<n1 && j<n2)
		{
			if(lst1.get(i) < lst2.get(j))
			{
				lst3.add(lst1.get(i));
				i++;
				
			}
			else
			{
				lst3.add(lst2.get(j));
				j++;
			}
		}
		while(i<n1)
		{
			lst3.add(lst1.get(i));
			i++;
		}
		while(j<n2)
		{
			lst3.add(lst2.get(j));
			j++;
		}
}
	
	
 }

