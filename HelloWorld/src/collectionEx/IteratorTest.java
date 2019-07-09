package collectionEx;

import java.util.ArrayList;

import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		//HashSet al1=new HashSet();
		al1.add("prachi");
		al1.add("Ashu");
		al1.add("Ashu");
		al1.add("prachi");
		al1.add("Savez");
		al1.add("Savez");
		System.out.println(al1);
		
		Iterator itr1= al1.iterator();
		while(itr1.hasNext())
		{
			String name= (String) itr1.next();
			if(name.equals("Ashu"))
			{
				itr1.remove();
			}
			else
			{
				System.out.println(name);
			}
		}
		
}
}
