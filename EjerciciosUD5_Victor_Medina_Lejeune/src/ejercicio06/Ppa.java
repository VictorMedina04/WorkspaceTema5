package ejercicio06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ppa {
	public static void main(String[] args) {

		List<Trabajador> listaTrabajadores = new ArrayList<Trabajador>();

		Trabajador trabajador = new Trabajador("Victor", "3426436R", 45, 2000);
		Trabajador trabajador1 = new Trabajador("Hugo", "3467755T", 40, 1900);
		Trabajador trabajador2 = new Trabajador("Rafael", "6834256P", 30, 1000);
		Trabajador trabajador3 = new Trabajador("Fernando", "1684437G", 38, 1000);

		listaTrabajadores.add(trabajador);
		listaTrabajadores.add(trabajador1);
		listaTrabajadores.add(trabajador2);
		listaTrabajadores.add(trabajador3);

		System.out.println("Sin orden");
		for (Trabajador trabajador4 : listaTrabajadores) {
			System.out.println(trabajador4);
		}

		Collections.sort(listaTrabajadores);

		System.out.println("Ordenado por horas");
		for (Trabajador trabajador4 : listaTrabajadores) {
			System.out.println(trabajador4);
		}
	}
}
