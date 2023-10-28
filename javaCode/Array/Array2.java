

public class Array2 {
	public static void main(String[] args)
	{
		int[][] arr = new int[3][3];
//		int[][] brr = new int[3][3];
		funArray2.acceptArray(arr);
		funArray2.displayeArray2D(arr);
//		funArray2.acceptArray(brr);
//		funArray2.displayeArray2D(brr);
//		int[] arr1 = funArray2.sumRowWise(arr);
//		funArray2.displayArray1D(arr1);
//		int[] arr2 = funArray2.sumColumnWise(arr);
//		funArray2.displayArray1D(arr2);
//		int[][] temp1 = funArray2.sum2Array(arr,brr);
//		System.out.println("sum of 2 array: ");
//		funArray2.displayeArray2D(temp1);
//		int[][] temp2 = funArray2.arrayTranspose(arr);
//		System.out.println("transpose: ");
//		funArray2.displayeArray2D(temp2);
//		int max =funArray2.arrayMax(arr);
//		System.out.println("max : " +max);
//		int min =funArray2.arrayMin(arr);
//		System.out.println("min : " +min);
		int w = 20;
		int count = funArray2.countNum(arr, w);
		System.out.println("count : " +count);
	}
}
