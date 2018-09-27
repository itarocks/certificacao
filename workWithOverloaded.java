package br.com.caelum.classesIngles;

import java.io.IOException;

class Veiculo{


	public void somarResultado(Long a ) {
		System.out.println("Chamou o long");
	}


	public void somarResultado(Long... a ) {
		System.out.println("Chamou o long");
	}

	public void somarResultado(Object a ) {
		System.out.println("Chamou o long");
	}

	//public void somarResultado(int... a ) {
	//	System.out.println("Se nao tiver nenhum que atenda acaba chamando o varags");
	//}

	// public void somarResultado(int a) {
	// 	System.out.println("entrou no mentodo com um parametro");
	// }
	// public void somarResultado(int a, int b) {
	// 	System.out.println("entrou no mentodo com dois parametros de inteiros");		
	// }
	// public void somarResultado(long a, long b) {
	// 	System.out.println("entrou no mentodo com dois parametros de long");
	// }
}
class Kadete extends Veiculo{
		public void somarResultado(int a, long y) throws IOException {
		System.out.println("entrou no mentodo com um parametro");
	}
}
public class workWithOverloaded extends Veiculo{
	public static void main(String... args){
		long d,x;
		d = x = 0;
		workWithOverloaded a = new workWithOverloaded();
		//a.somarResultado(1,2);
		//a.somarResultado(d,x);
		//a.somarResultado(1,2,4,5);
		a.somarResultado(4);
	}
}