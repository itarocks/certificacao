package br.com.caelum.classesIngles;
import java.util.*;
public class SortingArrayList{
	public static void main(String... args){
		List<Integer> inteiros = new ArrayList<>();
		inteiros.add(9);
		inteiros.add(new Integer(10));
		inteiros.add(new Integer(05));
		Collections.sort(inteiros);
		System.out.println(inteiros);

		String str1 = "one"; String str2 = "two"; 
		//str1 = str2;
		System.out.println(str1);
		System.out.println(str2);
		System.out.println( str1.equals(str1=str2) ); 
		int a =  (int) Math.round( Double.parseDouble(("--0.50").substring(1, ("--0.50")	.length()-1)) );
		System.out.println(a);
		System.out.println(1/0);
	}
}