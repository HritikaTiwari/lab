package collectionEx;

import java.util.HashMap;
import java.util.TreeMap;



@SuppressWarnings("unused")
public class HashMapEx {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[])
	{
		//HashMap hm = new HashMap();
		TreeMap hm = new TreeMap();
		hm.put("ramesh",1002);
		hm.put("naresh",190);
		hm.put("suresh",10);
		hm.put("mesha",50);
		System.out.println(hm);
		System.out.println("size of map is"+hm.size());
		System.out.println("first name is"+hm.firstKey());
		System.out.println("last name is"+hm.lastKey());
		System.out.println("keyset is"+hm.keySet());
		System.out.println("get operation is"+hm.get("suresh"));
		System.out.println("put operation is"+hm.put("mesha", 445));
		System.out.println(hm);
		System.out.println("ceiling entry is"+hm.ceilingEntry("ramesh"));
		System.out.println("clone is"+hm.clone());
		System.out.println("hashcode is"+hm.hashCode());
		System.out.println("keyset is "+hm.comparator());
		System.out.println("keyset is "+hm.containsValue(190));
}
}