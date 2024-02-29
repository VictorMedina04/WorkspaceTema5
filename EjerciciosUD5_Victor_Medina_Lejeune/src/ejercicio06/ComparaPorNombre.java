package ejercicio06;

import java.util.Comparator;

public class ComparaPorNombre implements Comparator<Trabajador> {

	@Override
	public int compare(Trabajador trabajador1, Trabajador trabajador2) {
		return -(trabajador1.getNombre().toLowerCase().compareTo(trabajador2.getNombre().toLowerCase()));
	}

}
