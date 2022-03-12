package com.basics;

class Mnop91{
  int i;
}

public class FinalInstanceVar {
	final Mnop91 obj = new Mnop91();//can be initialized here
	
	void FinalInstancevar(){
		//obj.i=10;
		
	//final Mnop91 obj;// can initialized here
	}
	
	void met() {
		obj.i=10;
		System.out.println(obj.i);
	}
public static void main(String... args) {	

}
}
