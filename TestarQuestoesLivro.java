package br.com.caelum.classesIngles;


public class TestarQuestoesLivro{

	public void correr(){

	}

	public void eat(){
			//correr();
	}
	 static String url = "jdbc://derby://localhost:1527//mydb";   static TestarQuestoesLivro getDatabase()   {      System.out.println("Getting DB");      return null;   }
	public static void main(String... args){
		//eat();
		//TestarQuestoesLivro a = new TestarQuestoesLivro();
		//a.eat();
		
		System.out.println( getDatabase().url );

	}
}
