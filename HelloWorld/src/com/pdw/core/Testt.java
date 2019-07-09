package com.pdw.core;


class one 
{ 
  public void m1() 
  { 
      System.out.println("Good"); 
  } 
} 

class two extends one 
{ 
  public void m2() 
  { 
      System.out.println("Morning"); 
  } 
} 

class Testt extends two 
{ 
  public void m3() 
  { 
      System.out.println("Sir"); 
  } 

  public static void main(String[] args) 
  { 
      Testt g = new Testt(); 
      g.m1(); 
      g.m2(); 
      g.m3(); 
  } 
}
