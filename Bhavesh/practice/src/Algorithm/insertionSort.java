package Algorithm;

public class insertionSort {

	public void insertionSorting(int[] arr) {
		int n =arr.length;
		for(int i = 1 ; i < n ; i++) 
		{
			int key = arr[i];
			int j = i-1;
			for(; j>=0 && arr[j]>key ; j--)
			{
				arr[j+1] = arr[j];
			}
			arr[j+1] = key;
		}
	}
}
