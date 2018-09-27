package br.com.caelum.classesIngles;

import java.time.*;
import java.util.*;
public class WorkWithDatesAndTimes{
	public static void main(String... args){
		// System.out.println(java.time.LocalDate.now());
		// System.out.println(LocalTime.now());
		// System.out.println(LocalDateTime.now());
		//Manipulating Dates and Times 
		//LocalDate // Data sem hora
		//LocalTime // hora
		//LocalDateTime // Data com hora
		//MonthDay // Dia de um mês
		//YearMonth // Mes e ano
		//Formato ISO --> Da maior unidade de tempo para a menor unidade de tempo
		// LocalDate d = LocalDate.now(); //Ano-MES-DD
		// LocalTime t = LocalTime.now();
		// LocalDateTime dt = LocalDateTime.now();
		// System.out.println(d);
		// System.out.println(t);
		// System.out.println(dt);
		// // Definir o fuso horario que quer representar as data
		// LocalTime t1 = LocalTime.now(ZoneId.of("America/Chicago"));
		// LocalTime t2 = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
		// System.out.println(t1);
		// System.out.println(t2);
		//Passar no minimo a hora e o minuto
		LocalTime d = LocalTime.of(12,00);
		System.out.println(d);
		LocalDate e1 = LocalDate.of(2014,1,25);
		LocalDate e = LocalDate.of(2014,Month.JANUARY,25);
		System.out.println(e);
		System.out.println(e1);
		
		List s1 = new ArrayList( ); s1.add("a"); s1.add("b"); s1.add("c"); s1.add("a"); if(s1.remove("a")){     if(s1.remove("a")){         s1.remove("b");     }else{         s1.remove("c");     } } System.out.println(s1);

	}
}