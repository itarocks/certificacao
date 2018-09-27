package br.com.caelum.classesIngles;

public class StringImutabillity{
	public static void main(String... args){
		// Pools de String
		// String a = "Itamar Rocha";
		// String b = "Itamar Rocha";
		// String d = "Itamar rocha";
		// String teste = new String("Teste");
		// String testea = new String("Teste");
		// String c = new String("Itamar Rocha");
		// if(a ==b ){
		// 	System.out.println("Os nomes são iguais");
		// }
		// if(a.equals(b) ){
		// 	System.out.println("Os nomes são iguais ate no equal");
		// }
		// if(teste.equals(testea) ){
		// 	System.out.println("Os nomes são iguais ate no new");
		// }
		// if(teste == testea ){
		// 	System.out.println("Os nomes são iguais no ==");
		// }
		// char cAt =  d.charAt(0);
		// int indexOFF = d.indexOf("r");
		// System.out.println("O valor do charAT é : " + indexOFF);
		String a = "animals";
		System.out.println(a.substring(3));
		System.out.println(a.substring(a.indexOf('m')));
		//equal() and equalsIgnoreCase()
		System.out.println(a.startsWith("a"));
		System.out.println(a.endsWith("a"));
        
        //Primitivo nao contém os metodos que estão presentes na String    
		// Char pedro = 'a';
		// System.out.println(pedro.startsWith("a"));

	String start = "animal";
	String result = start.replace('a','A');
	System.out.println("O valor do resultado é : " + result);

	}
}