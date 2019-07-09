package Lab8;
import java.io.BufferedReader;
import java.io.*;
public class Exercise3 {
		public static void main(String args[]) throws IOException
		{
			String s ="hello this is my String";
			FileReader fr = new FileReader("newFile.txt");
			BufferedReader br=new BufferedReader(fr);
			String i=br.readLine();
			int countLine=0;
			int countWords=0;
			int countCharacters=0;
			while(i != null) {
				String[] arr =i.split("\\s+");
				countWords = countWords + arr.length;
				String p = i.replaceAll(" ", " ");
				countCharacters = countCharacters + p.length();
				i = br.readLine();
				countLine++;
				
			}
			System.out.println("Number of line in file is " +countLine);
			System.out.println("Number of words in file is " +countWords);
			System.out.println("Number of characters in file is " +countCharacters);
	}
}

