package br.com.caelum.classesIngles;

public class PassDataAmongMethods{

	String nome = "itamar";

	public void setNome(String nome){

		this.nome = nome;
	}



	public String getNome(){

		return nome;
	}

 	Object recebeObjeto(Object c, String nome){
 	// PassDataAmongMethods teste = new PassDataAmongMethods();
 	 this.nome = nome;	
 	 return c;
 }

	public static void main(String... args){
		
		PassDataAmongMethods a = new PassDataAmongMethods();
		//a.nome = "Teste";
		a.recebeObjeto(a,"Teste");
		System.out.println("O valor do nome e " + a.nome );
	}
}