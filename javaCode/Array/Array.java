public class Array {
	public static void main(String[] args)
	{
		int[] arr = new int[4];
		funArray.acceptArray(arr);
		funArray.displayArray(arr);
		System.out.println("");
		int ans1 = funArray.findSum(arr);
		System.out.println("sum of array : " +ans1);
		int val = 20;
		int[] arr1 = funArray.findGreaterVal(arr,val);
		funArray.displayArray(arr1);
		int val1 = 50;
		int pos = funArray.serachVal(arr,val1);
		if(pos != -1)
		{
			System.out.println("position at: " +pos);
		}
		else
		{
			System.out.println("not found");
		}
		int[] arr2 = funArray.findMini(arr,val);
		funArray.displayArray(arr2);
 				
	}
}