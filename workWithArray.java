package br.com.caelum.classesIngles;

import java.util.*;

public class workWithArray{

//	abstract String nome;

	public static void main(String[] args){

		int[] tamanho =  new int[10];
		for (int i = 0; i < 10 ; i++ ) {
			tamanho[i] = i + 5;
			System.out.println("O valor do tamanho é: " + tamanho[i]);
		}

		int numbers[] = {6,9,1};
		// Preciso colocar import se for usar os metodos especificos do Array
		Arrays.sort(numbers); 

		String [] bugs = {"erro", "zuado", "dmais"};
		System.out.println("O valor do tamanho é: " + java.util.Arrays.toString(bugs));
		System.out.println("O valor do tamanho é: " + java.util.Arrays.toString(tamanho));
		 }
}