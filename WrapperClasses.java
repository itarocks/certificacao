package br.com.caelum.classesIngles;
import java.util.*;

public class WrapperClasses{

	public static void main(String... args){
		int primitive = Integer.parseInt("123");
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

	}
}