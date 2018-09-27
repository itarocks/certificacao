package br.com.caelum.classesIngles;

class A{
	private static int a = 10;
	static {
		System.out.println("O valor da variavel int é: " + a);	
	}
	{
		System.out.println("Metodo de instancia de inicializacao classe A");	
	}
	public A(){
		System.out.println("Construtor da classe A");
	}
	static{
		System.out.println("Metodo estatico de inicializacao classe A");	
	}
}
public class WorkWithOrderInitialization extends A{
{
		System.out.println("Metodo de instancia de inicializacao classe b");	
	}

	String string = "Itamar";
/*primeira parte 
{System.out.println("Pedro");}
static 
{System.out.println("Itamar");}
	public static void main(String... args){
		WorkWithOrderInitialization	 a = new 	WorkWithOrderInitialization();
		System.out.println("O maior numero inteiro é + " + Integer.MAX_VALUE ); 
	}*/
//Segunda parte
	public static void main(String... args){
		WorkWithOrderInitialization a = new WorkWithOrderInitialization();
		int[] iA;
		System.out.println(4 + 1.0f); 
	}
}