package br.com.caelum.classesIngles;
import java.util.*;

public class WrapperClasses{

	public static void main(String... args){
		//Transforma para primitivo
		int primitive = Integer.parseInt("123");
		//Transforma para Wrapper;
		Integer wrapper = Integer.valueOf("133");
		//Double d1 = new Double("abc") // throws NumberFormatException
		List<Double> weigths = new ArrayList<>();
		weigths.add(50.5);
		double first = weigths.get(0);
		//O que acha que vai acontecer se voce tentar retornar um Wrapper para 
		//primitivo passando nulo;
		//Wrapper do tipo inteiro 
		//Ate o JAVA 4 tinha que ter esse trampo todo
		Integer intWrapper = Integer.valueOf(1);
		// como voltar para um tipo primitivo 
		int intPrimitivo = intWrapper.intValue();
		System.out.println("O valor do primitivo é " + intPrimitivo);
		//JAVA 5
		//AutoBoxing
		Integer intWrapperJ5 = Integer.valueOf(3);
		intWrapperJ5++;
		//Aqui ele faz o autoboxing
		Byte a = 10;
		//Byte b = new Byte(1);
		Byte b = new Byte((byte)1);
		//Convertendo String em um primitivo
		String acb = "1";
		int bc = Integer.parseInt(acb);
		System.out.println("O valor de bc e " + bc);
		Integer teste = 10;
		int teste2 = 15;
		int soma = teste + teste2;
		System.out.println("O valor da soma é " + soma);		
		//Quando lidar com Wrapper preste atenção
		List<Integer> listaInteiros = new ArrayList<>();
		listaInteiros.add(1);
		listaInteiros.add(2);
		System.out.println("O conteudo da lista possui " + listaInteiros);
		//listaInteiros.remove(1); dessa forma remove o registro do indice 1
		listaInteiros.remove(new Integer(1));
		System.out.println("O conteudo da lista possui " + listaInteiros);



	}
}