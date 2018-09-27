package br.com.caelum.classesIngles;
import java.util.*;

interface Checktrait{
	boolean test(WritingSimpleLambda a);
}
// class CheckIfHopper implements Checktrait{
// 	public boolean test(WritingSimpleLambda a){
// 		System.out.println("O valor de can Hop : " + a.canHop());
// 		return a.canHop();
// 	}
// }
public class WritingSimpleLambda{
	private String species;
	private boolean canHop;
	private boolean canFly;
	public WritingSimpleLambda(String speciesNames, boolean hopper,boolean flyer){
		species = speciesNames;
		canHop = hopper;
		canFly = flyer;
	}
	public boolean canHop(){
		return canHop;
	}
	public String toString(){
		return species;
	}
	public boolean canFly(){
		return canFly;
	}
	public static void main(String... args){
		int a = 10;
		String s = String.valueOf(a);
		List<WritingSimpleLambda> animals = new ArrayList<>();
		animals.add(new WritingSimpleLambda("fish",true,false));
		animals.add(new WritingSimpleLambda("passaro",false,true));
		//forma tradicional
		//print(animals, new CheckIfHopper());
		//forma usando lambda expression / versão curta
		print(animals, x -> x.canHop());
		print(animals, y -> y.canFly());
		//usando lambda expressão completa
		//print(WritingSimpleLambda t) -> {return t.canHop();};
	}
		private static void print(List<WritingSimpleLambda> animals, Checktrait checker){
			for(WritingSimpleLambda animal: animals){
				if(checker.test(animal))
					System.out.println("o valor de checker: "  + checker.test(animal));
					System.out.println(animal + " ");
			}
		}
	}
