package collectionEx;
import java.util.Comparator;
import java.util.TreeSet;
import java.io.IOException; 
@SuppressWarnings("unused")
 class Employe implements Comparable{
String name;
int eid;
Employe(String name, int eid)
{
	this.name=name;
	this.eid=eid;
}
public String toString()
{
	return name+"--"+eid;
	
}
	@Override

	public int compareTo(Object obj1) {
		// TODO Auto-generated method stub
int eid1 = this.eid;
Employe e =(Employe)obj1;
int eid2=e.eid;
if(eid1<eid2)
{
	return -1;
			}else if(eid>eid2)
			{
				return 1;
			}
			else
			{
				return 0;
			}
	}	
}
public class TestEmp {
@SuppressWarnings("unused")
public static void main(String args[])
{
	Employe e1=new Employe("ramesh",100);
	Employe e2=new Employe("meesha",200);
	Employe e3=new Employe("rahul",10);
	Employe e4=new Employe("rameh",1);
	TreeSet t = new TreeSet();
	t.add(e1);
	t.add(e2);
	t.add(e3);
	t.add(e4);
	System.out.println(t);
	
	@SuppressWarnings("unchecked")
	TreeSet t1 = new TreeSet(new MyComparator3());
	t1.add(e1);
	t1.add(e2);
	t1.add(e3);
	t1.add(e4);
	System.out.println(t1);
}
}
class MyComparator3 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employe e1=(Employe)o1;
		Employe e2=(Employe)o2;
		String s1=e1.name;
		String s2=e2.name;

		return e1.compareTo(e2);
		
	}
}