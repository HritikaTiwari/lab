    import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
class Authentication {

	
	public static void main(String[] args) throws IOException
	{
		Scanner sc= new Scanner(System.in);
	FileReader fw= new FileReader("Login.txt");
	BufferedReader nr= new BufferedReader(fw);
	
	System.out.println("Enter Username: ");
	String uname=sc.next();
	System.out.println("Enter Password: ");
	String pwd=sc.next();
	
	String line=nr.readLine();
	String line1=nr.readLine();
	
	int flag=1;
	while(line!=null && line1!=null)
	{
		
	if(uname.equals("cap") && pwd.equals("123"))
	
	{
		System.out.println("Login");
		flag=0;
		break;
	}
	
	else 
	{
		line=nr.readLine();
		line1=nr.readLine();
	}
	}
	if(flag!=0)
	{
		System.out.println("Login invalid");

	}
	}

}
