package Algorithm;

public class bubbleSort {

	public void bubbleSortingAce(int[] arr) {
		int n = arr.length;
		for(int i = 0 ; i<n-1 ; i++)
		{
			boolean flag = false;
			for(int j = 0 ; j<n-i-1 ; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			if(!flag) 
			{
				break;
			}
		}
		
	}
	public void bubbleSortingDesc(int[] arr) {
		int n = arr.length;
		for(int i = 0 ; i<n-1 ; i++)
		{
			boolean flag = false;
			for(int j = 0 ; j<n-i-1 ; j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			if(!flag) 
			{
				break;
			}
		}
		
	}

}