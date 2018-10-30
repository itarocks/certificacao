package br.com.caelum.classesIngles;

public class Casting{
 public static Integer testInts(Integer obj, int var){     

     obj = var++;   
     obj++; 
     return obj;
         }

	public static void main(String... args){

		boolean b1 = false; boolean b2 = false; if (b2 != b1 = !b2){    System.out.println("true"); } else{    System.out.println("false"); }
	
	}
}