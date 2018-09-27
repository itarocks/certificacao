package br.com.caelum.classesIngles;


class Top{

	public Top(){

		System.out.println("X");
	}

	public Top(String s){
		System.out.println("B");
	}
}

public class InvokeOverloadMethods extends Top{

	public InvokeOverloadMethods(String s){
		super(s);
		System.out.println("D");	
	}

	final public static void main(String... args){


		new InvokeOverloadMethods("C");
		System.out.println();

	}


}