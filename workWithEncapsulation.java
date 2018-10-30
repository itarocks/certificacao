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

		int sum = 0;
      for (int i = 0, j = 10; sum > 20; ++i, --j)      // 1
      {
         sum = sum+ i + j;
      }
      System.out.println("Sum = " + sum);
	}
}