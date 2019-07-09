package collectionEx;
import java.util.TreeSet;
public class HashSetEx {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args)
{
	TreeSet ts=new TreeSet();
	ts.add(13);
	ts.add(12);
	ts.add(13);
	ts.add(13);
	ts.add(2);
	ts.add(10);
	System.out.println(ts);
}
}
