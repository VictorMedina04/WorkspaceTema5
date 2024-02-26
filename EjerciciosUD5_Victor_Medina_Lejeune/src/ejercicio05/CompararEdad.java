package ejercicio05;

import java.util.Comparator;

public class CompararEdad implements Comparator<Persona> {

	@Override
	public int compare(Persona persona, Persona persona2) {
		if (persona.getEdad() < persona2.getEdad()) {
			return -1;
		} else {
			if (persona.getEdad() > persona2.getEdad()) {
				return 1;
			}
		}
		return 0;
	}

}
