package br.com.caelum.classesIngles;

abstract class A{

	public void exibirMensagem(){

		System.out.println("Esse é o metodo de A");

	}

	public abstract int calcularNumero(int a, int b);

}
abstract class B extends A{
}
public class workModifiers{
	public static void main(String args[]){


		//B a = new B();

		//a.exibirMensagem();

		//Class Access 
		// Access modifiers 
		//Default nivel de pacote
		//public todo o JU(Java Universe) consegue enxergar.
		// Final Classes

	}
}
