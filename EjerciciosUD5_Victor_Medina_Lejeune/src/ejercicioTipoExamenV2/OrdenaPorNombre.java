package ejercicioTipoExamenV2;

import java.util.Comparator;

import ejercicioTipoExamen.Palabra;

public class OrdenaPorNombre implements Comparator<Palabra> {

	@Override
	public int compare(Palabra palabra1, Palabra palabra2) {

		return -(palabra1.getNombre().toLowerCase().compareTo(palabra2.getNombre().toLowerCase()));
	}

}
