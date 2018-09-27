package br.com.caelum.classesIngles;

public class RelationalOperators{

	int x = 4;
	String vazia = "Itamar";
	public int getValue(){
		return x;
	}
	public static void main(String[] args){
		//exclusive or 
		boolean a = true; 
		Boolean b = true;
		RelationalOperators teste = new RelationalOperators();
		//Algumas vezes short circuit evita o risco de 
		//tomarmos um NullPointerExceptions
		if(teste.vazia != null && teste.getValue() < 5){
			System.out.println("Eu sei que vai entrar no IF");
		}
		// if(a ^ b){
		// System.out.println("Os valores são exclusivos");}
		// else{
		// System.out.println("Os valores não são exclusivos");}	
	}
}