package br.com.caelum.classesIngles;

public class workWithEncapsulation{
  static char ch;
	private String nome;
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	public static void main(String[] args){
		//int[5] scores;

int c = 0b01001110_00100000;
        float z = 3.234_567f; //3
		workWithEncapsulation a = new workWithEncapsulation();
		workWithEncapsulation b = new workWithEncapsulation();

		if(!a.equals(b)){
			System.out.println("They are not equal");
		}
		else{
		   System.out.println("They are equals");	
		}

		System.out.println("O valor de c" + "" + ch);	
	}
}