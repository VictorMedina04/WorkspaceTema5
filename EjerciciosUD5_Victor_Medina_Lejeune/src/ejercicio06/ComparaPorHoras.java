package ejercicio06;

import java.util.Comparator;

public class ComparaPorHoras implements Comparator<Trabajador> {

	@Override
	public int compare(Trabajador trabajador1, Trabajador trabajador2) {
		if (trabajador1.getHorasTrabajadas() < trabajador2.getHorasTrabajadas()) {
			return -1;
		} else {
			if (trabajador1.getHorasTrabajadas() > trabajador2.getHorasTrabajadas()) {
				return 1;
			}
		}
		return 0;
	}

}
