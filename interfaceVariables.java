package br.com.caelum.classesIngles;

interface Itamar{
	int a = 10;
	int d = 25;
	//por padrao os metodos assumem que são publics em uma interface
	int testeFuncao();
	 default double getTemperature(){
		return 10.0;
	}
}
public class interfaceVariables implements Itamar{
	//less acessible does not compila
	// protected int testeFuncao(){
	// 	return 10;
	// }
	public int testeFuncao(){
		return 35;
	}
	final int b; 
	{
		b = 10;
	}
	final int c;
	interfaceVariables(){
		c = 15;
	}
	public static void main(String... args){
		    Itamar xa = null;
		    interfaceVariables xb = new interfaceVariables();
			System.out.println("o valor de a " + a);
			System.out.println("o valor de a " + xa.a);
			//a = 15;
			System.out.println("Retorno do metodo getTemperature " + xb.getTemperature());
	}
}