package br.com.caelum.classesIngles;

import java.util.*;
import java.util.function.*;

public class PredicatesSearch{
	private String species;
	private boolean canHop;
	private boolean canFly;

	public PredicatesSearch(String speciesNames, boolean hopper,boolean flyer){
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
	List<PredicatesSearch> animals = new ArrayList<PredicatesSearch>();
		animals.add(new PredicatesSearch("fish",false,false));
		animals.add(new PredicatesSearch("passaro",false,true));
		animals.add(new PredicatesSearch("andorinha",false,true));
		//forma tradicional
		//print(animals, new CheckIfHopper());
		//forma usando lambda expression / versão curta
		//O exemplo abaixo é mais verboso
		print(animals, (PredicatesSearch x)  -> {return x.canFly();});
		print(animals, x -> x.canHop());
		print(animals, (y) -> y.canFly());
		//usando lambda expressão completa
		//print(WritingSimpleLambda t) -> {return t.canHop();};
	}
		private static void print(List<PredicatesSearch> animals, Predicate<PredicatesSearch> checker){
			for(PredicatesSearch animal: animals){
				if(checker.test(animal)){
					System.out.println("o valor de checker: "  + checker.test(animal));
					System.out.println(animal + " ");
					}
			}
		}
		}
	