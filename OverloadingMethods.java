package br.com.caelum.classesIngles;
//Sobrecarga
public class OverloadingMethods{

	public static void receberInteger(Integer a){
		System.out.println("É claro que um short não consegue chamar por aqui");
	}
	final public static void main(String... args){
		int a = 10; 
		receberInteger(a);
	}
}