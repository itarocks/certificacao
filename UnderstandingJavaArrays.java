package br.com.caelum.classesIngles;


public class UnderstandingJavaArrays{
	static char a;
	final public static void main(String... args){
		System.out.println("O valor de a e : " + a);
		//Exemplo de Array anonimo
		int[] numbers = {1,2,3};
		String[] insetos = {"Mosca","coelho","teste"};
		System.out.println(java.util.Arrays.toString(insetos));
		System.out.println("tamanho " + insetos.length + "primeira posicao" + insetos[0]);
	}
}