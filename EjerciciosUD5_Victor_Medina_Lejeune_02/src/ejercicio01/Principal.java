package ejercicio01;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		Secretaria secretaria = new Secretaria(listaAlumnos);

		Alumno alumno = new Alumno("Pedro", "Martinez", "1ºAyF", 7, 19);
		Alumno alumno1 = new Alumno("Victor", "Medina", "1ºDAM", 6, 20);
		Alumno alumno2 = new Alumno("Manuel", "Maman", "1ºDAM", 9, 20);
		Alumno alumno3 = new Alumno("Ana", "Lopez", "1ºComercio", 7, 18);
		Alumno alumno4 = new Alumno("Jose Miguel", "Casanova", "1ºComercio", 7, 19);
		Alumno alumno5 = new Alumno("Juan Jose", "Gomez", "1ºDAM", 9, 17);
		Alumno alumno6 = new Alumno("Ana Maria", "Nuñez", "1ºAyF", 10, 18);

		secretaria.addAlumno(alumno);
		secretaria.addAlumno(alumno1);
		secretaria.addAlumno(alumno2);
		secretaria.addAlumno(alumno3);
		secretaria.addAlumno(alumno4);
		secretaria.addAlumno(alumno5);
		secretaria.addAlumno(alumno6);

		int op, edad;
		String nombre, apellidos, nombreCurso, letra;
		double notaMedia;

		do {
			System.out.println("""
					1-Mostrar toda la lista
					2-Mostrar lista de los alumnos que empiezan por una letra dada
					3-Tamaño lista
					4-Alumnos con nota media mayor a 9
					5-Los 3 primeros alumnos
					6-Alumno con menos edad
					7-Primer alumno de la lista
					8-Alumnos con nombres mayores a 10 letras
					9-Alumnos que su nombre empieza por a y son mayores a 6 letras
					0-Salir
					""");
			op = Leer.datoInt();
			switch (op) {
			case 1:
				secretaria.mostrarLista();
				System.out.println();
				break;
			case 2:
				System.out.println("Introduzca la letra con la que empezaran los nombres de todos los alumnos");
				letra = Leer.dato();
				secretaria.mostrarAlumnosEmpiecenPorXLetra(letra);
				System.out.println();
				break;
			case 3:
				System.out.println("El tamaño de la lista es: " + secretaria.contarTamayoLista());
				System.out.println();
				break;
			case 4:
				System.out.println(secretaria.calcularAlumnosMayorQueNueve());
				System.out.println();
				break;
			case 5:
				secretaria.mostrarTresPrimeros();
				System.out.println();
				break;
			case 6:
				System.out.println(secretaria.obtenerAlumnoMenorEdad());
				System.out.println();
				break;
			case 7:
				System.out.println(secretaria.obtenerPrimerAlumno());
				System.out.println();
				break;
			case 8:
				System.out.println(secretaria.obtenerNombresMayorADiez());
				System.out.println();
				break;
			case 9:
				System.out.println(secretaria.obtenerNombresMayorASeisYEmpiecenPorA());
				System.out.println();
				break;
			case 0:
				System.out.println("Saliendo..");
				break;
			default:
				System.out.println("Introduzca un opcion correcta");
				break;
			}

		} while (op != 0);

	}
}
