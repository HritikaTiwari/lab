import java.util.Scanner;
public class cubeSum {
	public int FindSumOfCubes(int n) {
	    int sum=0;
	   for(int i=1;i<=n;i++)
	   {
		   sum=sum+i*i*i;
	   }
	    return sum;
	}
	    public static void main(String[] args)
	    {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a Number");
	     int n= sc.nextInt();
	     cubeSum e2 =new cubeSum();
	     System.out.println(e2.FindSumOfCubes(n));
	     sc.close();
	    }
}

	

