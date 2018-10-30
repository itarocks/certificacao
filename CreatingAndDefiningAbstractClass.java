package br.com.caelum.classesIngles;

//Defining an Abstract Class

abstract class  Animal{
	int tamanho;
	abstract void exibirMensagem();
	protected abstract String passarCertificacao();

	//abstract static void texto();
}

abstract class Peixe extends Animal{

	protected String passarCertificacao(){
		return "10";
	}
}


//CreatingConcreteClass
public class CreatingAndDefiningAbstractClass extends Peixe{

	void exibirMensagem(){
		System.out.println("Bem vindo a Abstrãção");
	}


	public static void main(String... args){
		long g = 012;
		Animal a = new CreatingAndDefiningAbstractClass();

	}
}