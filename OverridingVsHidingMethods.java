package br.com.caelum.classesIngles;

//Classes quando o metodo é estatico
class Marsupial{
		public static boolean isBiped(){
			return false;
		}
		public void getMarsupialDescription(){
			System.out.println("Marsupial walk on two legs: " + isBiped());
		}
	}

public class OverridingVsHidingMethods extends Marsupial{

	public static boolean isBiped(){
			return true;
		}
		public void getOverridingVsHidingMethods(){
			System.out.println("OverridingVsHidingMethods:  " + isBiped());
		}

	final public static void main(String... args){
		//Chamada quando o metodo é estatico
		OverridingVsHidingMethods a = new OverridingVsHidingMethods();
		a.getMarsupialDescription();
		a.getOverridingVsHidingMethods();
	}
}