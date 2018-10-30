package br.com.caelum.classesIngles;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDatesTimes{
	public FormattingDatesTimes(){};
	public static void main(String... args){
		LocalDate date = LocalDate.of(2014, Month.JUNE, 28);
		//Comecei agora
		//DateTimeFormatter tem que importar o full qualified name 
		//se não o código não funciona
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime);
		//System.out.println(shortDateTime.format(date));
		System.out.println("O valor da data formata e : " + shortDateTime.format(date));
		//If you do not use predefined formtas, you can create your own.
		//Remember M(Uppecase) is a month and m(lowercase) is minute.

}
}