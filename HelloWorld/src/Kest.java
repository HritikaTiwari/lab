
public class Kest {
public static void main(String[] args)
{
	String s=new String("hritika");
	String s1=new String("hritika");
	
	System.out.println(s.equals(s1));
	System.out.println(s1.compareTo(s));
	System.out.println(s1.compareToIgnoreCase(s));
	System.out.println(s.length());
	System.out.println(s.toLowerCase());
	System.out.println(s.replace("hritika","ritul"));
	System.out.println(s.toUpperCase());
	System.out.println(s.concat("tiwari"));
	System.out.println(s.substring(0,5));
	System.out.println(s.toCharArray());
	System.out.println(s.indexOf("tiwari"));
	System.out.println(s.endsWith(s1));
	System.out.println(s.startsWith("t"));
	System.out.println(s.codePointAt(2));
	System.out.println(s.codePointCount(1, 2));
	System.out.println(s.contains(s1));
	System.out.println(s.equalsIgnoreCase(s));
	System.out.println(s.hashCode());
	System.out.println(s.indexOf(s, 2));
	System.out.println(s.getBytes());
	
	
	
}
}
