import java.util.Scanner;
public class calculateSum
{
	public int calculateSum(int n) {
		
	}
	public static int main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your LastNumber: ");
		int n=sc.nextInt();
	    int sum=0;
                for(int a=1;a<=n;a++)
                     {
	                  if(a%3==0 ||a%5==0)
	                       {
	                         	sum=sum+a;
	                       }
                     
                
                     }
              return(sum);
		}
}



