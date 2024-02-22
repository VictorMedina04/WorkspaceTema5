package ejercicio05;

import java.util.Comparator;

public class CompararEdad implements Comparator<Persona> {

	public int compararPorEdad(Persona persona, Persona persona2) {
		if (persona.getEdad() < persona2.getEdad()) {
			return -1;
		} else {
			if (this.dorsal > o.dorsal) {
				return 1;
			}
		}
		return 0;
	}

	}
}
