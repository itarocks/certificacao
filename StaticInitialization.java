package br.com.caelum.classesIngles;

public class StaticInitialization{

	private static final int NUM_SECONDS; 

	 static{
	// 	int num60 = 60;
	// 	int num20 = 20;
	 	NUM_SECONDS = 10;
	 }
	public static void main(String... args){

		//NUM_SECONDS = 10;
		//NUM_SECONDS = num60 * num20;
	}
}