package br.com.caelum.classesIngles;


interface A{
}

interface B{
}

class C implements  A, B{
}

class E{
}
class F extends E{
}
class D{
}
public class CastingObjects extends C {
	public static void main(String... args){
		D d = new D();
		A variavel = (A) d;
		if(d instanceof A)
			System.out.println("Nesse caso funciona porque é uma interface");
		// if(d instanceof F)
		// 	System.out.println("Aqui não funciona");
	}
}