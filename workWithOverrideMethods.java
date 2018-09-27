package br.com.caelum.classesIngles;

class Rede{

	public void exbirMensagem(){

		System.out.println("Aqui é Rede");
	}

	public int somar(){

		return 3;
	}



}

class Cielo extends Rede{

	public void exbirMensagem(){

		System.out.println("Aqui é Cielo");
	}

	public void exibirMensagemUnica(){

		System.out.println("Esse metodo só tem na Cielo");	
	}


	public int somar(){

		return 3;
	}


}

public class workWithOverrideMethods{

	public static void main(String[] args){

 	Rede a = new Cielo();
 	 a = new Rede();


 	//a.exibirMensagemUnica();
 	a.exbirMensagem();
		
	}
}