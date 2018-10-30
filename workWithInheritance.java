package br.com.caelum.classesIngles;
// Exemplo de IS A
/*class Vehicle{
	public void exbirMensagem(){
		System.out.println("É um veiculo");
	}
}
class subaru extends Vehicle{
}
*/
// Exemplo de HAS-A
class Vehicle{
   public static String nome;
}
public class workWithInheritance{

  private static Vehicle meuVeiculo;  

  public static void main(String args[]) throws Exception{

//  	subaru a = new subaru();
//  	a.exbirMensagem();
  	workWithInheritance a = new workWithInheritance();
  	System.out.println("O valor e : " + meuVeiculo.nome);
  	  }
}