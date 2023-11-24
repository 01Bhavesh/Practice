package Algorithm;

import java.util.Arrays;

public class quickSort {
public static void main(String[] args) {
	int[] arr = {51,52,7,10,65,50,55};
	System.out.println("before sorting");
	System.out.println(Arrays.toString(arr));
	quickSort(arr,0,arr.length-1);
	System.out.println("after sorting");
	System.out.println(Arrays.toString(arr));
}

private static void quickSort(int[] arr, int start, int end) {
	if(start<end)
	{
		int p = partition(arr,start,end);
		quickSort(arr,start,p-1);
		quickSort(arr,p+1,end);
	}
	
}

private static int partition(int[] arr, int start, int end) {
	int pivot = start;
	int i = start;
	int j = end;
	while(i<j)
	{
		while(i<end && arr[i]<=arr[pivot])
		{
			i++;
		}
		while(j>pivot && arr[j]>arr[pivot])
		{
			j--;
		}
		if(i<j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	int temp = arr[j];
	arr[j] = arr[pivot];
	arr[pivot] = temp;
	return j;
}
}