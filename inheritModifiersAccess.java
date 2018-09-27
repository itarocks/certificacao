package br.com.caelum.classesIngles;

public class inheritModifiersAccess extends modifiersAccess {

	public void exibirMensagem(){
	System.out.println("Esse e o metodo da classe filha");	
	}

	public void exibirNumeradores(){
	System.out.println("Esse e o valor do numero" + numeradores);	
	}

	public static void main(String... args){

		inheritModifiersAccess a = new inheritModifiersAccess();
		a.exibirMensagem();
		a.exibirNumeradores();
		a.exibirMensagem("Itamar");

	}
}