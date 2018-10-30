package br.com.caelum.classesIngles;

public class WorkWithPrimitives{


	public void receberDoisParametros(int a, long b){
		System.out.println("Metodo foi chamado");
	}

	public static void main(String... args){

//Octal
	/*	int a = 017; 
		int b = 0;

		System.out.println("Base Octal " + a); 
		System.out.println("Base Octal " + b); 
*/
			String ita = "Itamar";
			int tamanho = 0;
			System.out.println("O valor do tamanho é : " + ita.length());
			WorkWithPrimitives chamada = new WorkWithPrimitives();
			short a = 10, b =10;
			chamada.receberDoisParametros(a,b);

	}
}