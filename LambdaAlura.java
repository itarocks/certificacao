package br.com.caelum.classesIngles;
import java.util.*;


class A{
	A(int a){

	}
}

class B extends A{
	B(){
		//System.out.println("O this ou super tem que ser a primeira instrução");
		super(10);
	}
}

public class LambdaAlura{	

	public void teste(){

	}

	public static void testeVoid(){
		//LambdaAlura.teste();
		//teste();
	}

	public static void main(String... args){	
		List<String> buniess = new ArrayList<>();
		buniess.add("long ear");
		buniess.add("floppy");
		buniess.add("hoppy");
		System.out.println(buniess);
		//Lambda do Array List
		buniess.removeIf(s -> s.charAt(0) != 'h');
		System.out.println(buniess);
	}
}