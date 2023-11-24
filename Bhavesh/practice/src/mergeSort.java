import java.util.Arrays;

public class mergeSort {
public static void main(String[] args) {
	int[] arr = {11,55,44,88,12,33,94,331};
	
	System.out.println("before sorting");
	System.out.println(Arrays.toString(arr));
	mergesorting(arr,0,arr.length-1);
	System.out.println("after sorting");
	System.out.println(Arrays.toString(arr));
}

private static void mergesorting(int[] arr, int first, int end) {
	if(first<end)
	{
		int mid = (first+end)/2;
		mergesorting(arr,first,mid);
		mergesorting(arr,mid+1,end);
		merge(arr,first,end,mid);
		
	}
	
}

private static void merge(int[] arr, int first, int end, int mid) {
	int i,j,k;
	int n1 = mid-first+1;
	int n2 = end-mid;
	
	int[] arr1 = new int[n1];
	int[] arr2 = new int[n2];
	
	for(i = 0 ; i<n1 ; i++)
	{
		arr1[i] = arr[first+i];
	}
	for(j = 0 ; j<n2 ; j++)
	{
		arr2[j] = arr[mid+1+j];
	}
	
	i=0;
	j=0;
	k=first;
	while(i<n1 && j<n2)
	{
		if(arr1[i]<arr2[j])
		{
			arr[k] = arr1[i];
			i++;
			k++;
		}
		else
		{
			arr[k] = arr2[j];
			j++;
			k++;
		}
	}
	while(i<n1)
	{
		arr[k] = arr1[i];
		i++;
		k++;
	}
	while(j<n2)
	{
		arr[k] = arr2[j];
		j++;
		k++;
	}
}
}
