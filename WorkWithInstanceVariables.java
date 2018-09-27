package br.com.caelum.classesIngles;

public class WorkWithInstanceVariables{
		static{
			System.out.println("Estou com fome pedro");	
			}
	public void eatHungry(boolean hungry){
		if(hungry){
			System.out.println("Estou com fome");
			{
			System.out.println("Estou com fome ita");	
			}
		}
	}
	static String $_itamar = "Itamar";
	float b;
	public void exbirMensagem(){
		//Variaveis locais não podem ser estaticas;
		//static teste;
	}
	public static void main(String... args){
		WorkWithInstanceVariables teste = new WorkWithInstanceVariables();

		System.out.println("O valor default do float é : "  + teste.b);
		teste.eatHungry(true);
	}
}