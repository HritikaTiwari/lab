package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
	public int getSecondSmallest(int[] arr)
	{
		Arrays.sort(arr);
		if(arr[0]==arr[1])
		return arr[2];
		else
		return arr[1];
	
	}
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Elements: ");
		int size=sc.nextInt();
		int arr[] = new int[5];
		for(int i=0; i<5; i++)
		{
		arr[i]=sc.nextInt();
		}
		Exercise1 e= new Exercise1();
		System.out.println(e.getSecondSmallest(arr));
	}

}
