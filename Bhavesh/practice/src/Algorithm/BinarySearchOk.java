package Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearchOk {
	public static int binarySearch(List<Integer> list , int key){

		int first = 0;
		int last = list.size() - 1;
		
		while(first <= last){
				
			int mid = (first + last) / 2;
			
			if(list.get(mid) == key){
				return mid;
			}
			else if(list.get(mid) > key){
				last = mid - 1;
			}else{
				first = mid + 1;
			}
		}
		
		return -1;
	}

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in); 
		
		List<Integer> list = new ArrayList<>();
		
		System.out.println("Enter Elements :-");
		for(int i = 0; i < 5; i++){
			
			list.add(sc.nextInt());
		}
		
		System.out.println("Enter the key :- ");
		int key = sc.nextInt();

		int loc = binarySearch(list, key);
		
		System.out.println("location of element :- "+loc);
	}
}
