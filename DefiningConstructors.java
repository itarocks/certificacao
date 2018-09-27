package br.com.caelum.classesIngles;

class A{
	public A(){
		//Aqui tem uma chamada para super implicita
		System.out.println("Construtor de A");
	}
}

class B extends A{
	public B(){
		//Aqui tem uma chamada para super implicita
		System.out.println("Construtor de B");
	}
}
class C extends B{
	public C(int a){
		//Aqui tem uma chamada para super implicita
		System.out.println("Construtor de C");
	}
}
public class DefiningConstructors extends C{
	public DefiningConstructors(){
		super(1);
	}
	public static void main(String... args){
		DefiningConstructors a = new DefiningConstructors();
	}
}