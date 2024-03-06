package ejercicio;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {

		Carta carta1 = new Carta("As", "Basto", 1);
		Carta carta2 = new Carta("Dos", "Copa", 2);
		Carta carta3 = new Carta("Rey", "Espada", 12);
		Carta carta4 = new Carta("Caballo", "Oro", 11);

		List<Carta> listaCarta = new ArrayList<Carta>();

		Mazo mazo = new Mazo(listaCarta);

		String nombre, palo;
		int numCarta;

		mazo.addCarta(carta1);
		mazo.addCarta(carta2);
		mazo.addCarta(carta3);
		mazo.addCarta(carta4);

		System.out.println("Buscar una carta concreta");
		System.out.println("Introduzca el numero de la carta y su palo");
		numCarta = Leer.datoInt();
		palo = Leer.dato();
		if (mazo.buscarCartaPorNumeroYPalo(numCarta, palo) == null) {
			System.out.println("No existe la carta");
		} else {
			System.out.println(mazo.buscarCartaPorNumeroYPalo(numCarta, palo));
		}

		System.out.println();
		System.out.println("Las cartas que valen cero son:");
		System.out.println(mazo.buscarValorCero());
		System.out.println();

		System.out.println("La puntuación total es:" + mazo.calcularPuntuacionTotal());
		System.out.println();

		System.out.println(
				"Para modificar el nombre de una carta introduzca el numero de la carta, el palo y el nombre que le va ha poner");
		numCarta = Leer.datoInt();
		palo = Leer.dato();
		nombre = Leer.dato();
		mazo.modificarNombre(numCarta, palo, nombre);

		System.out.println("Toda la lista:");
		mazo.mostrarLista();

		System.out.println("Ordenado por natural");
		mazo.ordenarNatural();
		System.out.println("Ordenado por no natural");
		mazo.ordenarNoNatural();

	}

}
