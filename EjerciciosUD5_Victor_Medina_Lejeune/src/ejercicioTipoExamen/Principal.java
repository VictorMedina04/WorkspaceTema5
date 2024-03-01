package ejercicioTipoExamen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {

		List<Palabra> listaPalabras = new ArrayList<Palabra>();
		Diccionario diccionario = new Diccionario(listaPalabras);
		int op, id = 3;
		String nombre, significado, significadoNuevo;

		Palabra palabra = new Palabra(1, "Arrecio", "Que hace mucho frio");
		Palabra palabra2 = new Palabra(2, "Mano", "Extensión del cuerpo");

		diccionario.addPalabra(palabra);
		diccionario.addPalabra(palabra2);

		do {
			System.out.println("""
					1-Añadir palabra
					2-Modificar signifiacado
					3-Borrar una palabra
					4-Buscar una palabra por el nombre
					5-Imprimir diccionario
					6-Ordenar diccionario
					""");
			op = Leer.datoInt();
			switch (op) {
			case 1:
				System.out.println("Introduzca el nombre de la palabra");
				nombre = Leer.dato();
				System.out.println("Introduzca su significado");
				significado = Leer.dato();
				Palabra palabra3 = new Palabra(id, nombre, significado);
				id++;
				diccionario.addPalabra(palabra3);
				break;
			case 2:
				System.out.println("Introduzca el nombre de la palabra a modificar");
				nombre = Leer.dato();
				System.out.println("Introduzca su nuevo significado");
				significadoNuevo = Leer.dato();
				diccionario.modificarPalabra(nombre, significadoNuevo);
				break;
			case 3:
				System.out.println("Introduzca el nombre de la palabra que quiere borrar");
				nombre = Leer.dato();
				diccionario.borrarPalabra(nombre);
				break;
			case 4:
				System.out.println("Introduzca la palabra de la cual quiere saber su significado");
				nombre = Leer.dato();
				System.out.println(diccionario.buscarPalabraPorNombre(nombre).getSignificado());
				System.out.println();
				break;
			case 5:
				diccionario.imprimirDiccionario();
				break;
			case 6:
				Collections.sort(listaPalabras, new OrdenaPorNombre());
				for (Palabra palabra4 : listaPalabras) {
					System.out.println(palabra4);
				}
				break;

			}
		} while (op != 0);

	}

}
