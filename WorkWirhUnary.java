package br.com.caelum.classesIngles;


public class WorkWirhUnary{
	public static void main(String... args){

		Boolean x = true;
		System.out.println("o valor de x e : " + (x = !x));
		int a = 2;
		int soma = ++a + 10 / a; 
		System.out.println("o valor de x e : " + soma);

	}
}