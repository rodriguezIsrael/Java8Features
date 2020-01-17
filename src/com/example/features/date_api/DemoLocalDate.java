package com.example.features.date_api;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

/**
 * 
 * Mostramos el uso y ejemplos de LocalDate
 * 
 * @author isivroes
 *
 */
public class DemoLocalDate {

	public static final void main(String[] anyValue) {

		LocalDate localDateOne = LocalDate.of(1992, 8, 16);

		System.out.println("Pinta la fecha -> " + localDateOne);

		LocalDate localDateTwo = LocalDate.of(1992, Month.AUGUST, 16);

		System.out.println("Pinta la fecha -> " + localDateTwo);

		System.out.println("Obtenems el año del localDate " + localDateOne.getYear());
		System.out.println("Obtenems el mes del localDate " + localDateOne.getMonth());
		System.out.println("Obtenems el dia del localDate " + localDateOne.getDayOfMonth());
		System.out.println("Fecha actual de Japon " + LocalDate.now(Clock.system(ZoneId.of("Japan"))));

	}

}
