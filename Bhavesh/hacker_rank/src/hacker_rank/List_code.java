package hacker_rank;

import java.util.ArrayList;
import java.util.List;

public class List_code {
	public static void main(String[] args) {
		List<List<Integer>> lst = new ArrayList<List<Integer>>();
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(4);
		lst.add(l1);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(5);
		l2.add(6);
		l2.add(8);
		lst.add(l2);
		List<Integer> l3 = new ArrayList<Integer>();
		l3.add(10);
		l3.add(10);
		l3.add(5);
		lst.add(l3);
		
		System.out.println(lst.get(1).get(1));
		
	}
}
