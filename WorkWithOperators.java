package br.com.caelum.classesIngles;	

public class WorkWithOperators{
	public static void main(String... args){
		//numeric promotion rules
		// String a = "3";
		// float f = 2.1f;
		// byte xa =  10;
	 //    byte xb =  20;
	 //    int soma1 = xa + xb;
	 //    long soma2 = xa + xb;
	 //    double soma3 = xa + xb;
		// System.out.println(a.getClass());
		// int divisao = 10 / 3;
		// int modulo = 10 % 3;
		// int xy = 10;
		// int xc = 20;
		// double soma = xy + xc;
		// System.out.println("O valor da divisão é: " + divisao + " " + soma );
		//Esse codigo não compila
		//int x = !5;
		int x = 3; 
		int y = ++x * 5 / x-- + --x;
		System.out.println("x is " + x);
		System.out.println("y is " + y);
	}
}