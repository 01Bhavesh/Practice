package Algorithm;

public class merge2Arrays {

	public void mergeArrays(int[] arr1, int[] arr2, int[] arr3) {
		int i = 0 , j = 0 , k = 0 ;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				arr3[k] = arr1[i];
				k++;
				i++;
			}
			else
			{
				arr3[k] = arr2[j];
				k++;
				j++;
			}
		}
		while(i<arr1.length)
		{
			arr3[k] = arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length)
		{
			arr3[k] = arr2[j];
			k++;
			j++;
		}
		
	}

}
