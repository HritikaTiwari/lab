package collectionEx;

import java.util.Comparator;
import java.util.TreeSet;

public class StringCompare {
	public static void main(String[] args) 
	{
//		System.out.println("GK".compareTo("ZA"));
//		System.out.println("S".compareTo("M"));
//		System.out.println("X".compareTo("X"));
		
		TreeSet t = new TreeSet(new MyComparator());
		
		t.add("Abhi");
		t.add("Hritika");
		t.add("Satish");
		t.add("Vaibhav");
		System.out.println(t);
	}
}
class MyComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String i1=(String)o1;
		String i2=(String)o2;
//		if(i1<i2)
//			return +1000;
//		else if(i1>12)
//			return -10000;
//		else
//			return 0;
		return -i1.compareTo(i2);
		
	}
	
}
