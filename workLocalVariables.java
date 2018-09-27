package br.com.caelum.classesIngles;

public class workLocalVariables{
	public int metodoLocal(){

		int locala = 10;
		int localb = 20; 
		return localb + locala;
	}

	// itens estaticos só conversam com itens estaticos
	static int idade = 10; 

	String a , b = "Itamar";


	public void retornaIdade(int idade){

		this.idade = idade; 
		System.out.println("O valor da idade é : " +  idade);
	}

	public static void main(String... a){

		int contador; 
		workLocalVariables b = new workLocalVariables();	
		b.retornaIdade(idade);
		// if(contador == 0){
		// 	contador = 1;
		//     System.out.println("o valor do contador é " + "" + contador);}
		// else{
		// 	contador = 0;
		// 	System.out.println("o valor do contador é " + "" + contador);}
		
		// Example of shadowing 
	}
}