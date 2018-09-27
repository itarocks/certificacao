package br.com.caelum.classesIngles;


interface A{
	public default void exbirMensagem(int a){
		System.out.println("Qual metodo será chamado");
	};
}
interface B{
	public default void exbirMensagem(){
		System.out.println("Qual metodo será chamado");
	};
}
public class DefaultMethods implements A,B{
		// public void exbirMensagem(){
		// 	System.out.println("Qual metodo será chamado");
		// }
	public static void main(String... args){

	}
}