package br.com.caelum.classesIngles;

public class UnderstandingJavaStatements{

	static Boolean a = true;
	Long b = 10l;
	long c = 10l;
	Short d = 20;
	public static void main(String... args){
		//if then 
		// if(a) System.out.println("Verdadeiro");
		// System.out.println("Falso");
		// System.out.println("Itamar");
		// if-then-else
		if(a)
			System.out.println("Verdadeiro");
		else
			System.out.println("Falso");
			System.out.println("Aqui já saiu do escopo e vai imprimir de qualquer forma");
		// nao compila
		int teste = 10;

		 

		// if(teste){}

	}
}