package FileEx;
import java.io.*;

class FileWriterEx {
	public static void main(String[] args) throws IOException
	{
		FileWriter fw= new FileWriter("cap.txt");
		fw.write(97);//character
		fw.write("sandeep \n intelect");
		fw.write("\n");
		char [] ch1= {'a','b','c'};
		fw.write(ch1);
		fw.write("\n");
		fw.flush();
		fw.close();
   }

}
