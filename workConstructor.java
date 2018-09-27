package br.com.caelum.classesIngles;


//Creating Constructors

public class workConstructor{
	int a ,b;
	//Default Constructor
	public workConstructor(){
	//	System.out.println("Constructor");
	//  This tem que ser a primeira instrução não comentada do Construtor
	//  Se não nao compila
		this(1,2);
	}
	public workConstructor(int a, int b){
		this.a = a;
		this.b = b;
	}
	public void workConstructor(){
		System.out.println("Aqui não temos um construtor");	
	}
	public static void main(String... args){		
		workConstructor a = new workConstructor();
		a.workConstructor();
		System.out.println("O valor de A e B e " + "" + a.a + " e " + a.b);
	}
}