package ejemplocomparator;

import java.util.Comparator;

public class ComparaNombre implements Comparator<Corredor> {

	// Este método recibe los dos corredores, y usando el método comparar de la
	// clase String devuelve las palabras ordenadas alfabéticamente.
	// si ponemos un signo - delante, lo ordenará de manera inversa
	@Override
	public int compare(Corredor c1, Corredor c2) {

		return -(c1.getNombre().toLowerCase().compareTo(c2.getNombre().toLowerCase()));
	}

}