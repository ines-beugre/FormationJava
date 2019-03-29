package com.serli.tp9.dates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateExample {

	public static void main(String[] args) {

		Instant instant = Instant.now();
		Instant i = instant.minus(5, ChronoUnit.DAYS);

		System.out.println(instant);
		System.out.println(i);

		LocalDate ld = LocalDate.now();
		LocalDate ld1 = ld.plusDays(2);
		System.out.println(ld);
		System.out.println(ld1);

		System.out.println("");

		System.out.println("la date de mois " + ld.getDayOfMonth());

		LocalDate anniv = LocalDate.of(1988, Month.OCTOBER, 21);
		LocalDate actuel = LocalDate.of(2019, Month.MARCH, 29);

		long years = ChronoUnit.YEARS.between(anniv, actuel);
		long days = ChronoUnit.DAYS.between(anniv, actuel);

		System.out.println("anniv: " + years);
		System.out.println("nombre de jours: " + days);

		// format
		String pattern = "dd.MM.yyyy";
		DateTimeFormatter format = DateTimeFormatter.ofPattern(pattern);
		System.out.println(format.format(LocalDate.of(2016, 7, 31)));

	}

}
