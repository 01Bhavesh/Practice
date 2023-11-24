package com.Test;

import java.util.Arrays;
import java.util.Scanner;

import Algorithm.bubbleSort;
import Algorithm.insertionSort;
import Algorithm.merge2Arrays;
import Algorithm.selectionSort;

public class mainClass {
public static void main(String[] args)
{
	int[] arr = {44,33,11,22,55};
	Scanner sc = new Scanner(System.in);
	bubbleSort ble = new bubbleSort();
	selectionSort sel = new selectionSort();
	insertionSort ins = new insertionSort();
	merge2Arrays merg = new merge2Arrays();
//	int choice;
//	
//	do {
//		System.out.println("1. bubbleSorting\n2. selectionSort\n3. insertionSort\n4. exit");
//		choice = sc.nextInt();
//		switch(choice)
//		{
//		case 1:
//			System.out.println("1. acending/n2. desending");
//			int a = sc.nextInt();
//			if(a==1)
//			{
//				ble.bubbleSortingAce(arr);
//				System.out.println(Arrays.toString(arr));
//			}
//			else if(a==2)
//			{
//				ble.bubbleSortingDesc(arr);
//				System.out.println(Arrays.toString(arr));
//			}
//			else
//			{
//				System.out.println("data is wrong");
//			}
//			break;
//		case 2:
//			sel.selectionSorting(arr);
//			System.out.println(Arrays.toString(arr));
//			break;
//		case 3:
//			ins.insertionSorting(arr);
//			System.out.println(Arrays.toString(arr));
//			break;
//		case 4:
//			sc.close();
//			System.out.println("thank you");
//			break;
//		}
//		
//	}while(choice != 4);

	int[] arr1 = {1,3,5,7,9};
	int[] arr2 = {2,4,6,8,10,12,14,16,18,20};
	int[] arr3 = new int[arr1.length+arr2.length];
	merg.mergeArrays(arr1,arr2,arr3);
	System.out.println(Arrays.toString(arr3));
	
}
}
