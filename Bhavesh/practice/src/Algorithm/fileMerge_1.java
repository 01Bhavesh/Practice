package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileMerge_1 {
public static void main(String[] args) throws IOException {
	BufferedReader br1 = new BufferedReader (new FileReader ("file1.txt"));
	BufferedReader br2 = new BufferedReader (new FileReader("file2.txt"));
	BufferedWriter bw = new BufferedWriter (new FileWriter("file3.txt"));
 	
	String str1 = br1.readLine();
	String str2 = br2.readLine();
	
	while(str1!=null && str2!=null)
	{
		int x = Integer.parseInt(str1);
		int y = Integer.parseInt(str2);
		if(x<y)
		{
			bw.write(str1);
			str1 = br1.readLine();
			bw.newLine();
		}
		else
		{
			bw.write(str2);
			str2 = br2.readLine();
			bw.newLine();
		}
	}
	while(str1!=null)
	{
		
		bw.write(str1);
		str1 = br1.readLine();
		bw.newLine();
	}
	while(str2!=null)
	{
		bw.write(str2);
		str2 = br2.readLine();
		bw.newLine();
	}
	bw.flush();
	br1.close();
	br2.close();
	bw.close();
}
}
