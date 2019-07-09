
public class AutoBoxing {

		  public static void main(String args[]){  
		    int a=10; //primitive data type
		        Integer a1=new Integer(a);//Boxing
		        a1.valueOf(a);
		        System.out.println(a1);  
		      //auto Boxing  
		        Integer a2=a;
		          
		        System.out.println("a2 value is"+a2);  
		        Integer i=new Integer(20);
		        int x=i.intValue();
		        System.out.println(x);
		        //auto un-boxing
		        int y=i;
		 }   
		}  

