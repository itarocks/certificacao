package br.com.caelum.classesIngles;

public class Casting{
	public static void main(String... args){


		int a = 10; 
		//Abaixo temos uma atribuição dentro de uma atribuição
		long b = (a = 3);

		System.out.println("O valor de a : " +  a);
		System.out.println("O valor de b : " +  b);

	}
}