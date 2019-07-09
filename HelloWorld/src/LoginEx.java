

	import java.io.*;
	import java.util.Scanner;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;

	class LoginEx{
	public static void main(String[] args) throws IOException
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Username: ");
	String uname=sc.next();
	System.out.println("Enter Password: ");
	String pwd=sc.next();
	FileWriter fw= new FileWriter("Login.txt");
	FileReader fr= new FileReader("Login.txt");
	if(uname.equals("cap") && pwd.equals("123"))
	
	{
		System.out.println("Login");
	}
	else
	{
		System.out.println("invalid");
	}
	fr.close();
	fw.close();
	}
	}
