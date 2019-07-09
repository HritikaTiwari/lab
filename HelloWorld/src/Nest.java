
public class Nest {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("ibm");
		StringBuffer sb1= new StringBuffer("ibm");
		System.out.println(sb.equals(sb1));//true
		System.out.println(sb==sb1);//true
		System.out.println(sb);
		sb.append("banglore");
		System.out.println(sb);
		
		String s=new String("qwerty");
		String s1=new String("qwerty");
		System.out.println(s.equals(s1));//true
		
		
		
		
		
	}
}
