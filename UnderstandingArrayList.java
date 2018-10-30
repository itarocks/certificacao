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
		System.out.println("O tamanho da lista é: " + lista.size());
		lista.remove(3);
		System.out.println("Os valores da lista são: " + lista );
		//Exemplos do metodo set
		// Aqui vai dar um IndexOutOfBoundsException 
		//lista.set(6,"Cabo Daciolo");
		//Exemplos do metodo Isempty and Size
		//Exemplo do metodo Contais
		System.out.println("A Lista contem Vera " + lista.contains("Vera"));
		//Exemplo do metodos Equals 
		//Exemplos do metodo clear
		lista.clear();
		System.out.println("Os valores da lista são: " + lista );
		//Metodo equals 
		ArrayList<String> lista4 = new ArrayList<>();
		lista.add(0, "Pedro");
		lista.add(1, "Pedro");
		lista.add(2, "teste");
		lista.add(3, "Pedro");
		lista.add("Pedro");
		ArrayList<String> lista5 = new ArrayList<>();
		lista.add(0, "Pedro");
		lista.add(1, "Pedro");
		lista.add(2, "teste");
		lista.add(3, "Pedro");
		lista.add("Pedro");
		//lista3 = lista;
		System.out.println(lista4.equals(lista5));
		lista4.add("Tamanho");
		System.out.println(lista4.equals(lista5));

	}
}