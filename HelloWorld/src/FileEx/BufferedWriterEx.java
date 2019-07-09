package FileEx;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
	public static void main(String[] args) throws IOException
	{
		FileWriter fw= new FileWriter("cap.txt");
		BufferedWriter bw =new BufferedWriter(fw);
		
		bw.write(100);//character
		bw.newLine();
		char [] ch= {'a','b','c'};
		bw.write(ch);
		bw.newLine();
		bw.write("welcome");
		bw.newLine();
		bw.write("to ibm");
		
		bw.flush();
		bw.close();
		fw.close();
   }
}
