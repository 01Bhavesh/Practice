package com.info;

import java.util.Arrays;

public class Merge {
	
	public static void main(String[] args) {
		
		int arr1[] = {25, 36, 37, 48};
		int arr2[] = {12, 27, 41, 50};
		
		int arr3[] = new int[arr1.length + arr2.length];
		
		int[] arr = merge(arr1, arr2, arr3);
		
		System.out.println(Arrays.toString(arr));
	}

	private static int[] merge(int[] arr1, int[] arr2, int[] arr3) {
		
		int i = 0, j = 0, k = 0;
		while(i < arr1.length && j < arr2.length){
			
			if(arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				i++;
				k++;
			}else {
				arr3[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		while(i < arr1.length) {
			arr3[k] = arr1[i];
			i++;
			k++;
		}
		
		while(j < arr2.length) {
			arr3[k] = arr1[j];
			j++;
			k++;
		}
		
		return arr3;
	}
}