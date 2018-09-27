package br.com.caelum.classesIngles;

public class SwithStatement{

private int getSortOrder(String firstName, final String lastname){

	//anotacoes importantes sobre o Swi

	final String middleName = "Patricia";
	int id = 0;
	switch(firstName){
		case middleName: 
		id = 5;
		break;
		case "Itamar": 
		id = 10;
		break;
	}
	return id;
}
	public static void main(String... args){
		SwithStatement teste = new SwithStatement();
		int retornoId = teste.getSortOrder("Itamar","Rocha");
		System.out.println("O valor do retorno é " + teste.getSortOrder("Itamar","Rocha")); 
		int size = 10;       int[] arr = new int[size];       for (int i = 0 ; i < size ; ++i) System.out.println(arr[i]);

	}
}