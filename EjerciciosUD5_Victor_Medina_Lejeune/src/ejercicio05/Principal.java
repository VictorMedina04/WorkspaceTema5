package ejercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
	public static void main(String[] args) {

		Persona p = new Persona(19, "Victor", "Ramirez", "2804938z");
		Persona p2 = new Persona(19, "Carlos", "Roman", "234234");
		Persona p3 = new Persona(18, "Bruno", "Yow", "q89q585");
		Persona p4 = new Persona(20, "Manuel", "Gómez", "235893");

		List<Persona> listPersona = new ArrayList<>();

		listPersona.add(p);
		listPersona.add(p2);
		listPersona.add(p3);
		listPersona.add(p4);

		System.out.println("Sin ordenar \n");

		for (Persona persona : listPersona) {
			System.out.println(persona);
		}
		System.out.println("\n\nOrdenar por nombre\n");
		Collections.sort(listPersona);
		for (Persona persona : listPersona) {
			System.out.println(persona);
		}

		System.out.println("\n\nOrdenar por edad\n");
		Collections.sort(listPersona, new CompararEdad());
		for (Persona persona : listPersona) {
			System.out.println(persona);
		}

	}
}
