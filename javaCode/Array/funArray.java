import java.util.Scanner;
public class funArray {
	public static void acceptArray(int[] arr)
	{
		int num = arr.length;
		for(int i = 0 ; i < num ; i++)
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("enter the number "+(i+1));
			arr[i] = sc.nextInt();
		}
//		return arr;
	}
	public static void displayArray(int[] arr)
	{
		System.out.print("{");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			
			if(i == (arr.length-1))
			{
				System.out.print(arr[i]);
				break;
			}
			System.out.print(arr[i]+ ",");
		}
		
		System.out.println("}");
	}
	public static int findSum(int[] arr)
	{
		int sum = 0;
		for(int i = 0 ; i<arr.length ; i++)
		{
			sum = sum + arr[i];
		}
		return sum;
	}
	public static int[] findGreaterVal(int[] arr, int val)
	{
		int[] arr1 = new int[arr.length];
		int cnt = 0;
		for(int i = 0; i < arr.length ; i++)
		{
			if(arr[i] > val)
			{
				arr1[cnt] = arr[i];
				cnt++;
			}
		}
		for(int j = cnt ; j<arr.length ; j++)
		{
			arr1[j] = 0;
		}
		return arr1;
	}
	public static int serachVal(int[] arr, int val)
	{
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] == val)
			{
				return i;
			}
		}
		return -1;
	}
	public static int[] findMini(int[] arr, int val)
	{
		int[] arr2 = new int[arr.length];
		int cnt = 0;
		for(int i = 0; i < arr.length ; i++)
		{
			if(arr[i]<val)
			{
				arr2[cnt] = arr[i];
				cnt++;
			}
		}
		for(int j = cnt ; j < arr.length ;j++)
		{
			arr2[j] = 0;
		}
		return arr2;
	}
}

















