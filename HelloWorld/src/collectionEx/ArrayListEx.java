package collectionEx;
import java.util.ArrayList;
import java.util.HashSet;
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		//HashSet al1=new HashSet();
		al1.add("prachi");
		al1.add("Ashu");
		al1.add("prachi");
		al1.add("Savez");
		al1.add("Hritika");
		al1.size();
	
		al1.remove("Hritika");
		//System.out.println(al1);
		ArrayList a1=new ArrayList();
		a1.add(123);
		a1.add(1545);
		a1.add(12);
		a1.add('x');
		a1.add(true);
		a1.addAll(al1);
		System.out.println(a1);
		//al1.removeAll(al1);
		a1.removeAll(a1);	
		//System.out.println(a1);
	
	}}
