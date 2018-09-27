package br.com.caelum.classesIngles;


public class DesiginingStaticMethodFields{

// Variaveis estaticas 
	

 public void exibirNome(){
 		System.out.println("Exibir Nome");
		exibirNomeCompleto();
}

 public void exibirNomeCompleto(){
 		System.out.println("Exibir Nome Completo");
}
	public static void main(String... args){
		DesiginingStaticMethodFields a = new DesiginingStaticMethodFields();
		a.exibirNome();
	}
}