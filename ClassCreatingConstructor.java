package br.com.caelum.classesIngles;

class A{
	A(){
		System.out.println("Construtor da classe A");
	}
	static{
		System.out.println("Inicializador statico da classe A");	
	}
	{
		System.out.println("Inicializador de instância da classe A");	
	}
}
class B extends A{
	B(){
		System.out.println("Construtor da classe B");
	}
	static{
		System.out.println("Inicializador statico da classe B");	
	}
	{
		System.out.println("Inicializador de instância da classe B");	
	}
}

public class ClassCreatingConstructor extends B{
//	public ClassCreatingConstructor(){
		//o jeito abaixo funciona mais cria mais outro objeto
//		new ClassCreatingConstructor(10);
//		}
		public ClassCreatingConstructor(int a){
			System.out.println("O valor de a é " + a );
			System.out.println("Construtor da classe Pai");
		}
		static {
			System.out.println("Inicializador statico da classe Pai");
		}
	public static void main(String... args){
		ClassCreatingConstructor a = new ClassCreatingConstructor(10);
	}
}