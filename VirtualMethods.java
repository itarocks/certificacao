package br.com.caelum.classesIngles;

class A{

	public String getName(){
		return "unknow";
	}
	public void displayInformation(){
		System.out.println("O nome do cara é: " + getName());
	}
}
public class VirtualMethods extends A{
	public String getName(){
		return "Itamar";
	}
	final public static void main(String args[]){
		A a = new VirtualMethods();
		a.displayInformation();
		A b = new A();
		b.displayInformation();
	}
}