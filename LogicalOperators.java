package br.com.caelum.classesIngles;

public class LogicalOperators{

	public void exbirString(){ 

	String s = this.toString();
	System.out.println("O valor do Booleano estranho é : " + s);
	}

	public static void main(String... args){

		 // int i, j, k;       i = j = k = 9;       System.out.println(i + "" + "" + j +  "" + k );
		 // boolean b = true||false;
		 // boolean c = true|false;
		 // float f = -123;
		// int a, b, c=100;
		 int a=100, b, c;
		 //String s = 'asdf';

		 LogicalOperators d = new LogicalOperators();
	d.exbirString();

	}
}