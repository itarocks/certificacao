package br.com.caelum.classesIngles;

public class CreatingImmutableClasses{
	private final int numberEggs;

	public CreatingImmutableClasses(int numberEggs){
		this.numberEggs = numberEggs;
	}
	public int getNumberEggs(){
		return numberEggs;
	}
	public static void main(String... args){

		CreatingImmutableClasses a = new CreatingImmutableClasses(10);

		a.numberEggs = 20;

	}
}