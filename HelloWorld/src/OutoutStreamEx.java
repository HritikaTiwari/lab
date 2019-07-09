import java.io.*;
public class OutoutStreamEx {
	public static void main(String[] args) throws IOException
	{
		String filepath="tmp.txt";
		FileOutputStream outputStram = new FileOutputStream(filepath);
		for(int i=0;i<10;i++)
		{
			outputStram.write(i);
		}
		FileInputStream inputStream = new FileInputStream(filepath);
		int i;
		while ((i=inputStream.read())!=-1)
		{
			System.out.println("I:"+1);
		}
	}
}
