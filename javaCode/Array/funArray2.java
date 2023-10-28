import java.util.Scanner;
public class funArray2 {
	public static void acceptArray(int[][] arr)
	{
		Scanner sc =new Scanner(System.in);
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				System.out.println("enter :"+i+".."+j);
				arr[i][j] = sc.nextInt();
			}
		}
	}
	public static void displayeArray2D(int[][] arr) 
	{
		for(int i = 0; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public static void displayArray1D(int[] arr)
	{
		for(int i = 0 ; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static int[] sumRowWise(int[][] arr)
	{
		int[] temp = new int[arr.length];
		for(int i = 0 ; i<arr.length ; i++)
		{
			for(int j = 0 ; j<arr[i].length ; j++)
			{
				temp[i] = temp[i] + arr[i][j];
			}
		}
		return temp;
	}
	public static int[] sumColumnWise(int[][] arr) 
	{
		int[] temp = new int[arr[0].length];
		for(int i = 0 ; i<arr[0].length ; i++)
		{
			for(int j = 0 ; j<arr.length ; j++)
			{
				temp[i] = temp[i] + arr[j][i];
			}
		}
		return temp;
	}
	public static int[][] sum2Array(int[][] arr , int[][] brr)
	{
		int[][] temp = new int[arr.length][arr[0].length];
		
		for(int i = 0 ; i<arr.length ; i++)
		{
			for(int j = 0 ; j<arr[i].length ; j++)
			{
				temp[i][j] = arr[i][j] + brr[i][j];
			}
		}
		return temp;
	}
	public static int[][] arrayTranspose(int[][] arr)
	{
		int[][] temp = new int[arr.length][arr[0].length];
		for(int i = 0 ; i<arr.length ; i++)
		{
			for(int j = 0 ; j<arr[0].length ; j++)
			{
				temp[j][i] = arr[i][j];
			}
		}
		return temp;
	}
	public static int arrayMax(int[][] arr)
	{
		int temp = Integer.MIN_VALUE;
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=0 ; j<arr[i].length; j++)
			{
				if(temp < arr[i][j])
				{
					temp = arr[i][j];
				}
			}
		}
		return temp;
	}
	public static int arrayMin(int[][] arr)
	{
		int temp =Integer.MAX_VALUE;
		for(int i = 0 ; i<arr.length ; i++)
		{
			for(int j = 0 ; j<arr[i].length ; j++)
			{
				if(temp > arr[i][j]) 
				{
					temp = arr[i][j];
				}
			}
		}
		return temp;
	}
	
	public static int countNum(int[][] arr, int w)
	{
		int count = 0;
		for(int i = 0 ; i<arr.length ; i++)
		{
			for(int j = 0 ; j<arr[i].length ; j++)
			{
				if(w == arr[i][j])
				{
					count++;
				}
			}
		}
		return count;
	}
}
	
	
	
	








	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 
