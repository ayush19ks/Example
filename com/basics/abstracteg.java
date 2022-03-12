package com.basics;

//abstract class mnop{
class mnop{
	private int i;
	mnop(){}
	mnop(int i){
		this.i=10;
	}// abstract class can have instance member and constructor
}
class Pqr extends mnop{
	private int j;
	Pqr(int j){
		//super(10);
		this.j=20;
	}
}


/*
interface IXyz{
	int j = 10;  //static,final internally abstract class can not have instance member & interface
    //IXyz(){}//not valid
}
*/
public class abstracteg {

}
