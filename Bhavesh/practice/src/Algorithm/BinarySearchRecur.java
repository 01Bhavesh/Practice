package Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearchRecur {
	
	public static int binary(int first, int last, List<Integer> list, int key) {
		
		if(first > last) {
			return -1;
		}
		
		int mid = (first + last) / 2;
		
		if(list.get(mid) == key) {
			return mid;
		}else if(list.get(mid) > key) {
			return binary(first, mid - 1, list, key);
		}else {
			return binary(mid + 1, last, list, key);
		}
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key");
		int key = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		System.out.println("Enter list of elements");
		for(int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
		}
		
		int ans = binary(0, list.size()-1, list, key);
	
		if(ans != -1) {
			System.out.println("Element found at :- "+ ans);
		}else {
			System.out.println("Element not found");
		}
	}
}
