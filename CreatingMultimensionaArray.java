package br.com.caelum.classesIngles;

public class CreatingMultimensionaArray{

	public static void main(String... args ){
		//String [][] rectangle = new String[3][2];
		int[][] twoD = new int[3][2];
		twoD[0][0] = 1;
		twoD[0][1] = 2;
		//twoD[0][2] = 2;
		twoD[1][0] = 3;
		twoD[1][1] = 4;
		twoD[2][0] = 5;
		twoD[2][1] = 6;
		//twoD[3][1] = 6;
		for (int i = 0 ; i < twoD.length ; i++) {
			for (int j = 0; j < twoD[i].length   ; j++) {
				System.out.println(twoD[i][j] + " ");
			}
		}
	}
}