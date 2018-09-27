package br.com.caelum.classesIngles;
import java.io.*;
public class TrabalhandoComException{
	public int somarValores() throws RuntimeException{
		try{
			String[] animals = new String[0];
			System.out.println(animals[0]);
		}catch(RuntimeException e){
			System.out.println("o valor da exceção " + e);
		}
		return 2;
	}
	public int Resultado() throws Exception{
		return 3;
	}
	public static void main(String... args) throws Exception{
		int tamanho = 0;
		TrabalhandoComException a = new TrabalhandoComException();
		a.somarValores();
		// try{
		// 	 tamanho = a.Resultado();
		// }catch(Exception e ){
		// 	System.out.println(e);
		// }
		System.out.println("O valor do tamanho é " + tamanho);
	}	
}