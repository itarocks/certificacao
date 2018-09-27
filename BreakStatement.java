package br.com.caelum.classesIngles;

public class BreakStatement{
	public static void main(String[] args){

		PRIMEIRO_FOR : for (int i = 0 ; i < 10 ; i++ ) {
				SEGUNDO_FOR : for (int b = 0 ; b < 3 ; b ++  ) {
					if(b == 2){						
						break PRIMEIRO_FOR;
					}
					else{
						System.out.println("Isso vai acontecer apenas uma vez");
					}					
				}	
		}
		int [][] list ={{1,13,5}, {1,2,5}, {1,2,4,5}};
		System.out.println("O valor da lista e: " +  list[1][2]);
		int tamanho = list[2].length;
		System.out.println("O tamanho da lista é: " + tamanho);
System.out.println(100/10.0);
 int a = 10;       int b = 20;       a += (a = 4);       b = b + (b = 5);       System.out.println(a+ ",  "+b);
		//
	
	}
}