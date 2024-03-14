package ejercicio02;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {

//		Ordenar las cadenas por orden alfabético.
//		* Buscar una cadena dada por teclado.
//		* Crear un nuevo String formado por la primera letra de cada palabra que contiene la lista.
//		* Borrar las palabras que tengan longitud impar de letras.
//		* Pasar todas las palabras a mayúsculas.

		List<String> listaPalabras = new ArrayList<String>();
		int op;
		String palabra;

		Gestion gestion = new Gestion(listaPalabras);

		gestion.addPalabra("Buenas");
		gestion.addPalabra("hola");
		gestion.addPalabra("como");
		gestion.addPalabra("estas");
		gestion.addPalabra("soy");
		gestion.addPalabra("Victor");

		do {
			System.out.println("""
					1-Ordenar las cadenas por orden alfabético.
					2-Buscar una cadena dada por teclado.
					3-Crear un nuevo String formado por la primera letra de cada palabra que contiene la lista.
					4- Borrar las palabras que tengan longitud impar de letras.
					5-Pasar todas las palabras a mayúsculas.
					0-Salir
					""");

			op = Leer.datoInt();
			switch (op) {
			case 1:
				gestion.mostrarLista(gestion.ordenarAlfabeticamente());
				System.out.println();

				break;
			case 2:
				System.out.println("Introduzca que palabra quiere buscar");
				palabra = Leer.dato();
				System.out.println("Su palabra buscada es " + gestion.buscarCadenaPorTeclado(palabra));

				break;
			case 3:
				break;
			case 4:
				gestion.borrarImpares();
				gestion.mostrarLista(listaPalabras);
				System.out.println();
				break;
			case 5:
				gestion.mostrarLista(gestion.convertirEnMayusculas());
				System.out.println();
				break;
			case 0:
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Introduzca una opcion correcta");
				System.out.println();
				break;
			}
		} while (op != 0);

	}
}
