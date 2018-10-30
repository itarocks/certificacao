package br.com.caelum.classesIngles;
import java.util.*;

public class ConvertBetweenArrayAndList{
	public static void main(String... args){

		//String[] array ={"Itamar", "Pedro"};
		//List<String> list = Arrays.asList(String[] array);
		//System.out.println(list.size());
		//list.set(1,"teste");
		//Sorting
		//Turning an Array List into an Array 
		List<String> list = new ArrayList<>();
		list.add("Hawk");
		list.add("robin");
		Object[] objectArray = list.toArray();
		System.out.println(objectArray.length);
		String[] stringArray = list.toArray(new String[0]);
		list.add("teste");
		System.out.println(stringArray.length);
		System.out.println(list.size());
		//Turning a Array to an List
		//String[] array = {"Pedro","Itamar"};
		String[] array = new String[10];
		List<String> lista2 = Arrays.asList(array);
		lista2.set(0,"Pedro");
		System.out.println(java.util.Arrays.toString(array));
		array[0] = "Caraca";
		System.out.println(java.util.Arrays.toString(array));
		System.out.println(lista2);
		//lista2.add("Aquivai dar uma exceção");


	}
}