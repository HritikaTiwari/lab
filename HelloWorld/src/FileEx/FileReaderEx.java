package FileEx;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) throws IOException
	{
	File f =new File("aaa.txt");
	FileReader fr=new FileReader(f);
	char[] ch=new char[(int) f.length()];
	fr.read(ch);
	for(char ch1:ch)
	{
		System.out.println(ch1);
	}
		System.out.println("*********************************************");
		FileReader fr1=new FileReader("abc1.txt");
		int i=fr1.read();
		while(i!=-1)
		{
			System.out.println((char)i);
			i=fr1.read();
		}
		System.out.println("******************************");
		FileReader fr2=new FileReader("abd1.txt");
		int il=fr2.read();
		while(il!=-1)
		{
			System.out.println((char)i);
			i=fr2.read();
		}
	
	}

}
