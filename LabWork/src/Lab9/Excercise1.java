package Lab9;
import java.util.*;
class Maps{
	int id;
	String name;
	Maps(int mid,String mname){
		id=mid;
		name=mname;
	}
	public String toString() {
		return "[id=" +id+", name=" +name+"]";
	}
}
public class Excercise1 {
  ArrayList getValues(HashMap mp) {
	  Collection values=mp.values();
	  ArrayList lists=new ArrayList(values);
	  return lists;
  }
  public static void main(String args[])
  {
	  Scanner sc= new Scanner(System.in);
	  Excercise1  e=new Excercise1 ();
	  Maps e1= new Maps(10,"hritzz");
	  Maps e2= new Maps(10,"hritika");
	  Maps e3= new Maps(10,"kamoo");
	  Maps e4= new Maps(10,"mansi");
	  HashMap<Integer, Maps> hm= new HashMap<Integer,Maps>();
	  hm.put(1,e1);
	  hm.put(2,e2);
	  hm.put(3,e3);
	  System.out.println(e.getValues(hm));
	  sc.close();
  }
  
  
  
}
