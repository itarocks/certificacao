package br.com.caelum.classesIngles;


public class workIdentifiersKeywords{
	
	public static void main(String...args){
	//identificadores validor 
		int $ita = 0;
		int _ita = 0;

		int Public = 15;
	// invalido 
		//int 1 = 0;
	//apos o primeiro caractere o ceu é o limite
		//int i$$$@ = 0;
		if(args[0] != null){
		// Define Classes
			System.out.println("O valor dos args é " + args[0]);
		}
		else{
			System.out.println("Não existem valores para serem exibidos");
		}
	}

}