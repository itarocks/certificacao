package br.com.caelum.classesIngles;

class Veiculo{
	private int anoFabricacao;

	public int getAnoFabricacao(){
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao){
		this.anoFabricacao = anoFabricacao;
	}
	public static void displayMessage(){
		System.out.println("Lembrando como trabalhar com Predicate");
	}
}
//public class ExtendingClass extends java.lang.Object{
public class ExtendingClass{
	final static public void main(String... args){
		//displayMessage();
		//System.out.println("O valor da idade e" + anoFabricacao);
		//ExtendingClass a = new ExtendingClass();
     	//System.out.println("O valor da idade e" + a.anoFabricacao);
	}
}