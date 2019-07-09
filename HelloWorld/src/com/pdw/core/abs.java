package com.pdw.core;


class C
{
   public void disp()
   {
	System.out.println("C");
   }
}

class Ab extends C
{
   public void disp()
   {
	System.out.println("A");
   }
}

class Bi extends C
{
   public void disp()
   {
	System.out.println("B");
   }
	
}

class abs extends Ab
{
   public void disp()
   {
	System.out.println("D");
   }
   public static void main(String args[]){

	abs obj = new abs();
	obj.disp();
   }
}
