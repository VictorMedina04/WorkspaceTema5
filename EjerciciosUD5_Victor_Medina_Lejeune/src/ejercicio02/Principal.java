package ejercicio02;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		mostraMenu();

	}

	static void mostraMenu() {
		List<Socio> listaSocios = new ArrayList<Socio>();
		CrudSocio crudSocio = new CrudSocio(listaSocios);
		Club club = new Club(crudSocio);
		double cuotaBase = 40, nuevaCuota, precioPista = 10;
		String dni, nombre, apellidos;
		int op, horas;

		listaSocios.add(new Socio("Manuel", "Gomez", "32752E", cuotaBase));
		listaSocios.add(new Socio("Victor", "Medina", "57235T", cuotaBase));
		listaSocios.add(new Socio("Alvaro", "Nuñez", "325634R", cuotaBase));
		listaSocios.add(new Socio("Fernando", "Jimenez", "623721P", cuotaBase));
		do {
			System.out.println("""
					1-Añadir
					2-Modificar cuota
					3-Borrar
					4-Mostrar socios
					5-Alquilar una pista
					6-Pagar cuota mensual
					""");
			op = Leer.datoInt();
			switch (op) {
			case 1:

				System.out.println("¿Quiere añadir algun socio?");
				System.out.println("Introduzca sus datos");
				System.out.println("Dni");
				dni = Leer.dato();
				System.out.println("Nombre");
				nombre = Leer.dato();
				System.out.println("Apellidos");
				apellidos = Leer.dato();
				Socio socio = new Socio(nombre, apellidos, dni, cuotaBase);
				crudSocio.addSocio(socio);
				System.out.println();

				break;
			case 2:
				System.out.println("Que socio quiere cambiar la cuota, introduzca el dni");
				dni = Leer.dato();
				System.out.println("Introduzca una nueva cuota para el socio");
				nuevaCuota = Leer.datoDouble();
				crudSocio.modificarSocio(dni, nuevaCuota);
				System.out.println();
				break;
			case 3:
				System.out.println("Que socio quiere borrar la cuota, introduzca el dni");
				dni = Leer.dato();
				crudSocio.borrarSocio(dni);
				System.out.println();
				break;
			case 4:
				crudSocio.mostrarSocios();
				System.out.println();
				break;
//			case 5:
//				System.out.println("¿Cuantas horas van ha alquilar la pista?");
//				horas = Leer.datoInt();
//				System.out.printf("El total ha pagar por la pista es: %.2f", club.alquilarPista(precioPista, horas));
//				System.out.println();
//				break;
			case 6:
				System.out.println("¿Que socio va ha pagar la cuota del mes? Introduzca dni");

				System.out.println();
				break;
			}
		} while (op != 0);
	}
}
