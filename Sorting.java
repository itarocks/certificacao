package br.com.caelum.classesIngles;
import java.util.*;
class A{
}
class B extends A{
}
public class Sorting{
	public static void main(String... args){
		System.out.println(100/9.9);
		A a = new A();
		B b = new B();
		//A subclass can always be assigned to a super class variable without any cast
		a = b;
		//O exemplo abaixo não compila
		//b = a;
		int[] number = {6,9,1};
		//Sem o sort a pesquisa binaria torna-se imprevisivel
		//Arrays.sort(number);
		for (int i = 0; i < number.length ; i++) {
			System.out.println(number[i] + "");
		}
		System.out.println(java.util.Arrays.toString(number));
		System.out.println(Arrays.binarySearch(number,1));
		System.out.println(Arrays.binarySearch(number,4));
		System.out.println(java.util.Arrays.toString(number));
		System.out.println(Arrays.binarySearch(number,8));

	}
}