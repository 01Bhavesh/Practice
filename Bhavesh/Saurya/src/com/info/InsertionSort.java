package com.info;

import java.util.Arrays;

public class InsertionSort {
	
		
		public static void main(String[] args) {
			
			int arr[] = {12, 5, 65, 34, 25, 61};
			
			System.err.println("Array Before sort");
			System.out.println(Arrays.toString(arr));
			
			System.out.println();
			insertionSort(arr);
			System.out.println();
			
			System.err.println("Array after sort");
			System.out.println(Arrays.toString(arr));
		}

		private static void insertionSort(int[] arr) {
			
			int n = arr.length;
			
			for(int i = 1; i < n; i++) {
				
				int key = arr[i];
				int j = i - 1;
				
				while(j >= 0 && arr[j] > key) {
					
					arr[j+1] = arr[j];
					
					j--;
				}
				
				arr[j+1] = key;
				
				System.out.println(Arrays.toString(arr));
			}
		}
}
