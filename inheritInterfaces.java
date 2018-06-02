package br.com.caelum.classesIngles;

public class inheritInterfaces implements workInterfaces{

	public int calcularValores(int a ){

		return a;
	}
	public static void main(String...args){
        // Constantes não podem ter o valor alterado 
		// Can not assign a value to final variable bar
        //BAR = 45;
        //a = "Teste";
		System.out.println("O valor da Constante é " + "" + BAR);
		System.out.println("O valor da String é  " + "" + a);

	}
}