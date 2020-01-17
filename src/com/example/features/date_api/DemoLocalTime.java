package com.example.features.date_api;

import java.time.LocalTime;
import java.time.ZoneId;

/**
 * 
 * @author isivroes
 *
 */
public class DemoLocalTime {

	public static final void main(String[] anythingYouWantPutHere) {

		System.out.println("Minima hora que se puede poner: " + LocalTime.MIN);
		System.out.println("Maxima hora que se puede pone: " + LocalTime.MAX);
		System.out.println("Maxima hora que se puede pone: " + LocalTime.MIDNIGHT);
		System.out.println("Se crea una hora: " + LocalTime.of(14, 35, 20));
		System.out.println("Se crea hora actual" + LocalTime.now());
		System.out.println("Se crea hora actual de Japon: " + LocalTime.now(ZoneId.of("Japan")));

	}
}
