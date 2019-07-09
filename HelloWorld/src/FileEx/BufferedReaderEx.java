package FileEx;

import java.io.*;


class BufferedReaderEx {
	public static void main(String[] args) throws IOException
	{
		//File f=new File("online.txt");
		FileWriter fe=new FileWriter("online.txt");
		PrintWriter out = new PrintWriter();
		//out.println("acgfh");

	
		FileReader fw= new FileReader("online.txt");
		BufferedReader bw =new BufferedReader(fw);
		String line=bw.readLine();
		while(line !=null)
		{
			System.out.println(line);
            line=bw.readLine();
		}
		
		bw.close();
   }
}


