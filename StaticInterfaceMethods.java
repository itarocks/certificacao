package br.com.caelum.classesIngles;


interface A{
	static void exibirMensagem(){
		System.out.println("Aqui temos um metodo estatico em uma interface");
	}
}
public class StaticInterfaceMethods implements A{
	public static void main(String... args){
		A.exibirMensagem();
	}
}