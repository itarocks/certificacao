package br.com.caelum.classesIngles;

public class workVarargs{
	public void exibirMensagem(String teste ,int... a){

		System.out.println("O tamanho do array é : " + "" + a.length);
		for (int i=0;i < a.length ; i++) {

			System.out.println("O valor de A é: " + "" + teste + "" + a[i]);			
		}
	}
	public static void main(String...args){
		workVarargs a = new workVarargs();
		//cria um array de tamanho zero se nada for passado
		a.exibirMensagem("Itamar");
		//forma 1 de chamar com varargs
		a.exibirMensagem("Itamar",1,2,2,2,2);
		//forma 2 de chamar com varargs
		a.exibirMensagem("Pedro", new int[]{7,8,9});
		//passando nulo
		a.exibirMensagem("Pedro",null);
	}
}