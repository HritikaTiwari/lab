package Lab8;
import java.io.*;


@SuppressWarnings("unused")
public class Exercise2 {
public static void main(String[] args) throws IOException
{
	
    FileReader fr = new FileReader("newFile.txt");
	BufferedReader br= new BufferedReader(fr);
	String line = br.readLine();
	int countLine =1;
	while(line !=null)
	{
		System.out.println(countLine+")"+line);
		line =br.readLine();
		countLine++;
		
	}
	br.close();
}
}
