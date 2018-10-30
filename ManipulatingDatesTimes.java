package br.com.caelum.classesIngles;
import java.time.*;

public class ManipulatingDatesTimes{
	public static void main(String... args){
		LocalDate date = LocalDate.now();
		System.out.println(date);
		date = date.plusDays(2);
		System.out.println(date);
		date.plusDays(2);
		System.out.println(date);
		java.time.LocalDate dt = java.time.LocalDate.parse("2015-01-01").minusMonths(1);
		System.out.println(dt);

	}
}