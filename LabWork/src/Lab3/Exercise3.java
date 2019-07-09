package Lab3;
import java.util.*;
public class Exercise3 {
public int[] getSorted(int[] a)
{
	int remainingDivision=0;
	int reverseNumber=0;
	int[] arr= new int[a.length];
	for(int i=0;i<a.length;i++)
{
		int temp=a[i];
		while(temp!=0)
		{
			remainingDivision=temp%10;
			reverseNumber=reverseNumber*10+remainingDivision;
			temp=temp/10;
		}
		arr[i]=reverseNumber;
		reverseNumber=0;
}
	Arrays.sort(arr);
	return arr;
}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array: ");
	int size=sc.nextInt();
	int[] nameArr = new int[size];
	sc.nextLine();
	for(int i=0; i<size; i++)
	{
	System.out.println("enter element:");
	nameArr[i]=sc.nextInt();
	sc.nextLine();
	}
	Exercise3 e= new Exercise3();
	System.out.println(Arrays.toString(e.getSorted(nameArr)));


}

}
