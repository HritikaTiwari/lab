package Lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Full File Name");
		String name= sc.nextLine();
		File fr = new File(name);
		if(fr.exists())
		{
			System.out.println("File already exists");
		}
		else
		{
			System.out.println("File not exists");
		}
		if(fr.canWrite())
		{
			System.out.println("File is Writable");
		}
		else
		{
			System.out.println("File not Writable");
		}
		if(fr.canRead())
		{
			System.out.println("File is Readable");
		}
		else
		{
			System.out.println("File not Readable ");
		}
		String path = fr.getAbsolutePath();
		String extension ="";
		int i = path.lastIndexOf('.');
		if(i>0) {
			extension = path.substring(i+1);
		}
		System.out.println("File path is "+extension);
		int b =(int) fr.length();
		System.out.println("File length in byte is"+b);
		
		
	}
}
