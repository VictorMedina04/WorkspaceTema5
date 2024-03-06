package ejercicioExamenV2;

import java.util.Comparator;

public class OrdenaPorPrecio implements Comparator<Trastero> {

	@Override
	public int compare(Trastero trastero1, Trastero trastero2) {
		if (trastero1.getPrecio() > trastero2.getPrecio()) {

			return -1;
		} else {
			if (trastero1.getPrecio() < trastero2.getPrecio()) {
				return 1;
			}
		}
		return 0;
	}

}
