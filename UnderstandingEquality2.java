package br.com.caelum.classesIngles;

public class UnderstandingEquality2{
	public static void main(String args[]){
		Integer a = 10;
		Integer b = 10; 
		if(a == b) {
			System.out.println("O valores são iguais");
		}else{
		System.out.println("O valores não são iguais");
		}
		Integer c = new Integer(10);
		Integer d = new Integer(10);
		if(c == d) {
			System.out.println("O valores são iguais");
		}else{
		System.out.println("O valores não são iguais");
		}
		String x = "Hello World";
		String y = " Hello World".trim(); //Aqui vai gerar uma nova String, por isso que é false
		System.out.println(x == y);
		System.out.println("Com equal vai dar true: " + x.equals(y));// Na String o equals tem uma sobrecarga
		//que verifica a igualdade e nao a referencia
		String p = "Hello World";
		String q = "Hello World".trim(); //Como não gera uma nova String é true
		System.out.println(p == q);

	}
}