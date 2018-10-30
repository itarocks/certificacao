package br.com.caelum.classesIngles;

import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
//class A implements Runnable{} 
//class B extends A implements Observer {}
public class StaticInitialization{
//	public static void novoNumero(int num){
	public static int novoNumero(int num){
		num = 8;
		return num;
	}
	public static void main(String... args){
		int num = 4;
		num = novoNumero(5);
		//novoNumero(5);
		System.out.println("O valor atual do numero é : " + num);
	}	
}
