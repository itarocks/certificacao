package br.com.caelum.classesIngles;

public class EncapsulationData{

	//Java Beans Rule
	private boolean playing;
	private String name;

	private int idade;
	public void setIdade(int idade){
		this.idade = idade;
	}
	public int getIdade(){
		return idade;
	}
	public static void main(String... args){

		EncapsulationData a = new EncapsulationData();
		a.setIdade(10);
		System.out.println("O valor da idade e " + "" + a.idade);

	}
}