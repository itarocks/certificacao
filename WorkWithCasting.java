package br.com.caelum.classesIngles;


class ContaCorrente{

	void makeNoise(){

		System.out.println("Generic Noise");
	}
}


class PessoaFisica extends ContaCorrente{

	void makeNoise(){

		System.out.println("Pessoa Fisica");
	}

	void playDead(){

		System.out.println("Play dead");	

	}
}

public class WorkWithCasting{

	public static void main(String args[]){


		ContaCorrente x = new ContaCorrente();
		PessoaFisica ab = (PessoaFisica) x;

		ContaCorrente []  a = { new ContaCorrente(), new PessoaFisica(), new ContaCorrente()};

		for (ContaCorrente contacorrente : a ) {
			
			if(contacorrente instanceof PessoaFisica){
                PessoaFisica d = (PessoaFisica) contacorrente; 
				d.playDead();
			}
		}

	}
}