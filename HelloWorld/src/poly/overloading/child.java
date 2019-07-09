package poly.overloading;
class Parent 
{ 
    public void m1() 
    { 
    	System.out.println("parent class m1 method");} 
   public void m2()
    {
    	System.out.println("parent class m2 method"); 
    	} } 
class child extends Parent 
{ @Override
public void m2()
    {
    	System.out.println("Test class  m2");
    	} 
public void m3() 
    {
    	System.out.println("Test class  m3");
    }
    public static void main(String[] args) 
    { 
        child obj1 = new child(); 
        obj1.m1();  
        obj1.m2();  
        obj1.m3();
    }}
