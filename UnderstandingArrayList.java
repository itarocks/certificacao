package br.com.caelum.classesIngles;
import java.util.*;
public class UnderstandingArrayList{
	public static void main(String... args){
		//antes do java 5 
		//aqui temos Objeto
		ArrayList a = new ArrayList();
		ArrayList b = new ArrayList(10);
		//a.add("Itamar");
		System.out.println("O valor de B é " + b);
		//ArrayList c = new ArrayList(b);
		//ArrayList list3 = new ArrayList(a);
		//generics 
		// it is not necessary 
		ArrayList<String> lista = new ArrayList<>();
		//Exemplos do metodo ADD
		boolean result = lista.add("Itamar");
		System.out.println("O Valor do retorno é: " + result);
		//No exemplo abaixo o metodo add é void, sendo assim não possui retorno.
		lista.add(0, "Pedro");
		lista.add(2, "teste");
		lista.add(3, "Pedro");
		lista.add("Pedro");
		System.out.println("Os valores da lista são: " + lista );
		//System.out.println(lista.remove(100));
		StringBuilder steste = new StringBuilder();
		System.out.println("O valor da builder é " + steste.length());
		//Exemplos do metodo Remove
		boolean deuCerto = lista.remove("Fracisco");
		System.out.println("Deu certo " + deuCerto);
		System.out.println("Os valores da lista são: " + lista );
		lista.remove(3);
		System.out.println("Os valores da lista são: " + lista );
		//Exemplos do metodo set
		//Exemplos do metodo Isempty and Size
		//Exemplos do metodo clear
		lista.clear();
		System.out.println("Os valores da lista são: " + lista );

	}
}