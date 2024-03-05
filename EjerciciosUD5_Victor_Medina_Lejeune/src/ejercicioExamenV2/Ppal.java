package ejercicioExamenV2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Ppal {
	public static void main(String[] args) {

		double metrosCuadrados, precio;
		String direccion;
		int numTrastero = 0, op, op2, leerOcupado;
		boolean ocupado;

		List<Trastero> listaTrasteros = new ArrayList<Trastero>();
		Oficina oficina = new Oficina(listaTrasteros);

		Trastero trastero1 = new Trastero(35, "C/6", 78, 300, false);
		Trastero trastero2 = new Trastero(100, "C/4", 45, 1000, true);
		Trastero trastero3 = new Trastero(15, "C/5", 33, 300, true);
		Trastero trastero4 = new Trastero(65, "C/9", 11, 800, false);

		oficina.addTrastero(trastero1);
		oficina.addTrastero(trastero2);
		oficina.addTrastero(trastero3);
		oficina.addTrastero(trastero4);

		do {
			System.out.println("""
					1-Añadir un trastero
					2-Buscar por precio, número y el más caro
					3-Eliminar trastero
					4-Modificar precio
					5-Ordenar por número y por precio
					6-Mostrar los no ocupados
					""");
			op = Leer.datoInt();
			switch (op) {
			case 1:
				System.out.println("Introduzca un nuevo trastero");
				System.out.println("¿Cúantos metros cuadrados tiene?");
				metrosCuadrados = Leer.datoDouble();
				System.out.println("¿Cúal es la dirección?");
				direccion = Leer.dato();
				numTrastero++;
				System.out.println("¿Cúal es el precio?");
				precio = Leer.datoDouble();
				System.out.println("¿Ésta ocupado? 1-Sí 2-No");
				leerOcupado = Leer.datoInt();
				while (leerOcupado != 1 || leerOcupado != 2) {
					System.out.println("Introduzca un dato valido");
					leerOcupado = Leer.datoInt();
				}
				if (leerOcupado == 1) {
					ocupado = true;
				} else {
					ocupado = false;
				}

				Trastero trastero = new Trastero(metrosCuadrados, direccion, numTrastero, precio, ocupado);
				oficina.addTrastero(trastero);
				System.out.println();
				break;
			case 2:
				do {
					System.out.println("""
							1-Buscar por precio
							2-Buscar por numero de trastero
							3-Buscar el más caro
							0-Salir
							""");
					op2 = Leer.datoInt();
					switch (op2) {
					case 1:
						System.out.println("Introduzca el precio de los trasteros que quiere buscar");
						precio = Leer.datoDouble();
						System.out.println(oficina.buscarTrasteroPorPrecio(precio));
						System.out.println();
						break;
					case 2:
						System.out.println("Introduzca el número del trastero que quiere buscar");
						numTrastero = Leer.datoInt();
						System.out.println(oficina.buscarTrasteroPorNumero(numTrastero));
						System.out.println();
						break;
					case 3:
						System.out.println("El trastero más caro es:");
						System.out.println(oficina.buscarTrasteroMasCaro());
						System.out.println();
						break;
					case 0:
						System.out.println("Saliendo");
						break;
					default:
						System.out.println("Introudzca una opción correcta");
						break;
					}
				} while (op2 != 0);
				break;
			case 3:
				System.out.println("Introduzca el número del trastero que quiere eliminar");
				numTrastero = Leer.datoInt();
				oficina.eliminarTrastero(numTrastero);
				System.out.println();
				break;
			case 4:
				System.out.println("Introduzca el número del trastero que quiere modificar");
				numTrastero = Leer.datoInt();
				System.out.println("Introduzca el nuevo precio del trastero");
				precio = Leer.datoDouble();
				oficina.modificarPrecioTrastero(numTrastero, precio);
				System.out.println();
				break;
			case 5:
				do {
					System.out.println("""
							1-Ordenar por precio
							2-Ordenar por número
							0-Salir
							""");
					op2 = Leer.datoInt();
					switch (op2) {

					case 1:
						Collections.sort(listaTrasteros, new OrdenaPorPrecio());
						for (Trastero trastero5 : listaTrasteros) {
							System.out.println(trastero5);
						}
						System.out.println();
						break;
					case 2:
						Collections.sort(listaTrasteros);
						for (Trastero trastero5 : listaTrasteros) {
							System.out.println(trastero5);
						}
						System.out.println();
						break;

					}
				} while (op2 != 0);
				break;
			case 6:
				oficina.mostrarNoOcupados();
				System.out.println();
				break;
			case 0:
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Introduzca una opción correcta");
				break;
			}
		} while (op != 0);

	}
}
