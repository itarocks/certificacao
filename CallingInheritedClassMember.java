package br.com.caelum.classesIngles;

class A{
	public void exibirMensagem(){
		System.out.println("Metodo da Classe A");
	}
}
class AA extends A{

	AA(){
		super();
	}
	public void exibirMensagem(){
		super.exibirMensagem();
		System.out.println("Metodo da Classe AA");
	}
}
public class CallingInheritedClassMember{
	public static void main(String... args){
		A a = new A();
        AA aa = new AA();
        //aqui ok pq todo AA é um A;
        a = aa;
        //Aqui nao funciona e vai dar erro de compilação, pq nem todo a é um AA
        //aa = a;
        //So se forcar o cast
        //aa = (AA) a;
        aa.exibirMensagem();
        System.out.println("a = "+a.getClass());
        System.out.println("aa = "+aa.getClass());

        //Inheriting Methods
	}
}