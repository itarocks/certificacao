package br.com.caelum.classesIngles;

public class WorkWithForEach{

	final static public  void main(String[] args){
	 int a[] =  new int [10];
	 for (int i = 0 ; i < 10  ; i ++ ) {
	 	a[i] = i;
	 //	break;
	 }
	 for (int b : a) {
	 	System.out.println("O valor de b e : " + b);
	 }
	 // for ( : ) {
	 	
	 // }
	for (; ; ) {
		break;
	}

	}
}