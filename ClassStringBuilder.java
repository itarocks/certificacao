package br.com.caelum.classesIngles;

import java.time.*;
public class ClassStringBuilder{

	public static void main(String[] itamar){

		// String a;
		// StringBuilder sb1 = new StringBuilder();
		// //no ok sb1 = a;
		// // ok a = sb1.toString();
		// // String cannot be converted to StringBuilder sb1 = "Itamar";
		// StringBuilder sb2 = new StringBuilder(10);
		// sb1.append("Itamar");
		// sb1.insert(1,"Pedro");
		// System.out.println("O valor de SB1 é: " + sb1);
		// //sb2 += "Bruna";
		// //System.out.println("O valor de SB1 agora é: " + sb1);
		// //Metodos delete e deleteCharAt
		// sb1.delete(0,3);
		// System.out.println("O valor de SB1 é: " + sb1);
		// String result = sb1.toString();
		// //exemplo de programa não eficiente
		// //pq ele cria um monte de string em tempo de execução
		String alpha = "";
		for (char current = 'a'; current <= 'z' ; current++ ) {
			alpha += current;
		}
		System.out.println("O valor de alpha é " + alpha);

		//Abaixo Alguns Metodos de StringBuilder
		//Append
		StringBuilder a = new StringBuilder("Itamar");
		a.append(" Pedro");
		System.out.println("O valor de A é " + a );
		//Insert
		//No exemplo abaixo estou passando o indice 
		//a.insert("Melhores Amigos");
		a.insert(0,"Melhores Amigos");
		System.out.println("O valor de A é " + a );
		//Delete
		a.delete(0,2);
		System.out.println("O valor de A é " + a );
		a.reverse();
		System.out.println("O valor de A é " + a );

		// Metodo toString esse é importante. 
		String b = a.reverse().toString();


	}
}