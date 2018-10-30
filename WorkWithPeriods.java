package br.com.caelum.classesIngles;
import java.time.*;
public class WorkWithPeriods{
	public static void main(String... args){
		//Periodo invalido 
		Period wrong = Period.ofYears(1);
		wrong = Period.ofWeeks(1);
		// Calcular a idade de uma pessoa 
		long idade = Period.between(LocalDate.of(1990, Month.FEBRUARY,23),LocalDate.now()).getYears();
		System.out.println("O Valor da idade é : " + idade);
		//Encadaeamento de metodos não é permitido
		//Because are method statics only the last method is used
		Period encadeamento = Period.ofYears(1).ofWeeks(3);
		System.out.println(encadeamento);
		Period teste = Period.ofYears(1);
		teste = Period.ofWeeks(3);
		System.out.println(teste);
	}
}