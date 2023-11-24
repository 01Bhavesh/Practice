package com.info;

import java.util.Arrays;

public class SelectionSort {
	
	public static void selectionSort(int[] arr) {
		
		int n = arr.length;
		
		for(int i = 0; i < n - 1; i++) {
			
			int min_idx = i;
			
			for(int j = i + 1; j < n; j++) {
				
				if(arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
			
			
			System.out.println(Arrays.toString(arr));
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {12, 5, 65, 34, 25, 61};
		
		System.err.println("Array Before sort");
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		selectionSort(arr);
		System.out.println();
		
		System.err.println("Array after sort");
		System.out.println(Arrays.toString(arr));
	}
}
