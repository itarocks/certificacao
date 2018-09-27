package br.com.caelum.classesIngles;

public class UnderstandingEquality{

	 @Override
    public boolean equals(Object o) {
    	boolean retorno = false; 
        // If the object is compared with itself then return true  
        if (o == this) {
            retorno = true;
        }
        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof UnderstandingEquality)) {
            retorno = false;
        }
        return retorno;
}

	public static void main(String... args){

		String x = "Hello Wordl";	
		String y = "Hello Wordl";

		if(x == y){

			System.out.println("Utilizando == elas são iguais");
		}

		if(x.equals(y)){

			System.out.println("Utilizando equals elas são iguais");
		}

		UnderstandingEquality t1 = new UnderstandingEquality();
		UnderstandingEquality t2 = new UnderstandingEquality();


		if(t1 == t2){

			System.out.println("objetos Utilizando == elas são iguais");
		}

		if(t1.equals(t2)){

			System.out.println("objetos Utilizando equals elas são iguais");
		}


	}
}