package br.com.caelum.classesIngles;

 interface A{
	int TAMANHO = 10;
/*	static {
		TAMANHO = 10;
	}*/
}     
public class ImplementingInterfaces implements A{
	public static void main(String[] args){
		//Interface Variables
		//TAMANHO = 15;
		//Default Interface Metodos
		//int $a1a = 10;
		String letters = "abcde";
		String answer = letters.charAt(2);
		System.out.println(answer);
	}
}