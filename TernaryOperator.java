package br.com.caelum.classesIngles;


public class TernaryOperator{

public static int retornaIdade(){
	return 2;
}
public static int retornaId(){
	return 3;
}

	public static void main(String... args){
	int y = 10; 
	int x = (y > 5) ? 2 * y : 3 * y;
	System.out.println("O valor de x e : " + x);
	//pay a lot of attention with the types
	System.out.println((y < 5 ) ? 21 : "Zebra");
	//int animal = (y < 5 ) ? 21 : "Zebra";
	//Ternario dentro de ternario
	System.out.println((y > 5 ) ? (x >= 20) : (x < 20) ? true : false);
	int i = 10;
	System.out.println((i < 10) ? retornaId() : retornaIdade());
	}
}