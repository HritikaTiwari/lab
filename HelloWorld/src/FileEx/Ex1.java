package FileEx;
import java.io.*;
import java.io.IOException;

public class Ex1 {

	public static void main(String[] args) throws IOException
	{
		File ex= new File("capgemini.txt");
		System.out.println(ex.exists());
		System.out.println(ex.createNewFile());
		System.out.println(ex.mkdir());
		System.out.println(ex.isDirectory());
		System.out.println(ex.isFile());
	}
}
