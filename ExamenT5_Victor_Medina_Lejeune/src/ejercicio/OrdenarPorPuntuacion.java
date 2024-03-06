package ejercicio;

import java.util.Comparator;

public class OrdenarPorPuntuacion implements Comparator<Carta> {

	@Override
	public int compare(Carta carta1, Carta carta2) {

		if (carta1.calcularValorCarta() > carta2.calcularValorCarta()) {
			return -1;
		} else {
			if (carta1.calcularValorCarta() < carta2.calcularValorCarta()) {
				return 1;
			}
		}
		return 0;
	}

}
