package br.com.caelum.classesIngles;

public class EqualityOperators{

	//Aqui estamos falando de tipos primitivos
	static int a = 10;
	static double b = 10.0;
	public static void main(String... args){
		if(a ==b ){
			System.out.println("Os valores são iguais");
		}
		else{
			System.out.println("Os valores não são iguais");	
		}
		// if(a.equals(b) ){
		// 	System.out.println("Os valores são iguais");
		// }
		// else{
		// 	System.out.println("Os valores não são iguais");	
		// }
		//Compile time error
		/*
		boolean y = true == 3;
		boolean y = false != "Giraffe";
		boolean z = 3 == "Kangaroo";
		*/
		//Comparando objetos 
		//Serao iguais apenas se estiverem apontando para o mesmo objeto,
		//Ou se ambos apontarem para null
		//lembrar que quando não utilizo o new, o java tem o conceito de Pool de Strings.
		String a = new String("Itamar");
		String b = "Itamar";
		String c = a;
		if(a == b){
			System.out.println("A é = B");		
		}
		if(a == c){
			System.out.println("A é = C");		
		}
	}
}