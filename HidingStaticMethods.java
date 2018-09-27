package br.com.caelum.classesIngles;

class A{
	public  static void exibirMensagem(int b){
		System.out.println("Temos um metodo estatico na classe pai");
	}
}
class B extends A{
    //Se na classe pai tem a  
	//public void exibirMensagem(int b){
	// metodos estaticos a definição de qual metodo será chamado é em tempo
	//de compilação
	public static void exibirMensagem(int b){
		System.out.println("Temos um metodo estatico na classe filha");
	}	
}
public class HidingStaticMethods extends B{
	public static void main(String... args){
		A a = new B();
		a.exibirMensagem(3);
		//Overriding vs. Hiding Methods
		
	}
}