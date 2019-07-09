package collectionEx;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class TreeMapEx1 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[])
	{
		
		TreeMap hm = new TreeMap(new MyCom());
		hm.put("x",1);
		hm.put("a",9);
		hm.put("y",3);
		hm.put("l",2);
//		System.out.println(hm);
//		System.out.println("get operation "+hm.get("a"));
//		System.out.println("entryset "+hm.entrySet());
//		System.out.println("size "+hm.size());
//		System.out.println("keyset "+hm.keySet());
//		System.out.println("containskey "+hm.containsKey("l"));
		
		Set s= hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Entry e= (Entry) itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}		
}
}
@SuppressWarnings("rawtypes")
class MyCom implements Comparator
{
	public int compare(Object arg0, Object arg1)
	{
		String s1 =arg0.toString();
		String s2 =arg1.toString();
		return s2.compareTo(s1);
	}
}