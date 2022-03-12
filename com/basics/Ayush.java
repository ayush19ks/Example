package com.basics;

class Abc{
	int i;
}
public class Ayush {
  public static void main(String... args) {
	Abc obj = new Abc();
	obj.i=10;
	System.out.println(obj.i);
}
  static void met(Abc pobj) {
	pobj.i++;  
  }
}
