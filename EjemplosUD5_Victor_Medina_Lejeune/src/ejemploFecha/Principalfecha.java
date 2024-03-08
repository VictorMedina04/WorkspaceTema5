package ejemploFecha;

import java.time.LocalDate;

public class Principalfecha {
	public static void main(String[] args) {

		LocalDate fechaHoy = LocalDate.now();

		System.out.println(fechaHoy);

		LocalDate fecha1 = LocalDate.of(2004, 4, 22);
		System.out.println(fecha1);

		LocalDate fecha = LocalDate.parse("2004-04-02");

		System.out.println(fecha);

	}

}
