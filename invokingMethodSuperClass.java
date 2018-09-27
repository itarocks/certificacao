package br.com.caelum.classesIngles;


class Rede{

	public void exibirMensagem(){

		System.out.println("Aqui é rede");
	}

}


class Cielo extends Rede{

	public void exibirMensagem(){

		super.exibirMensagem();
		System.out.println("Aqui é Cielo");
	}

}

public class invokingMethodSuperClass{

	public static void main(String... args){

		Rede a = new Cielo();

		a.exibirMensagem();


	}
}