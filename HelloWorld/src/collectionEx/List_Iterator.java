package collectionEx;
import java.util.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator {
	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<String>();
	
		al1.add("ab");
		al1.add("bc");
		al1.add("cd");
		al1.add("de");
	    System.out.println(al1);
	    ListIterator litr =al1.listIterator();
	    while(litr.hasNext())
	    {
	    	System.out.println(litr.next()+" ");
	    }
	    while(litr.hasPrevious())
	    {
	    	String val=(String) litr.previous();
	    	if(val.equals("cd"))
	    	{
	    litr.set("Capgemini");
	    //System.out.println(litr.previous());
	    System.out.println(litr.next());
	    	}
	    	//System.out.println(litr.previous());
}
	    }
}