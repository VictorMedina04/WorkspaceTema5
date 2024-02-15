package ejercicio03;

import java.util.HashSet;
import java.util.Set;

import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {

		Set<Alumno> listaAlumnos = new HashSet<Alumno>();
		CRUDAlumno crudAlumno = new CRUDAlumno(listaAlumnos);
		int op;
		double notaMedia, nuevaNota;
		String nombre, apellido, dni;

		listaAlumnos.add(new Alumno(7, "Victor", "Medina", "32526259R"));
		listaAlumnos.add(new Alumno(7, "Álvaro", "Nuñez", "23642523E"));
		listaAlumnos.add(new Alumno(7, "Fernando", "Alfaro", "76347232O"));

		do {
			System.out.println("""
					1-Añadir
					2-Modificar
					3-Mostrar
					4-Borrar
					0-Salir
					""");
			op = Leer.datoInt();
			switch (op) {
			case 1:

				System.out.println("Para añadir a un alumno inserte los siguientes datos correctamente");

				System.out.println("Nombre del alumno");
				nombre = Leer.dato();

				System.out.println("Apellidos del alumno");
				apellido = Leer.dato();

				System.out.println("Dni del alumno");
				dni = Leer.dato();

				System.out.println("Nota media del alumno en el curso");
				notaMedia = Leer.datoDouble();

				Alumno alumno = new Alumno(notaMedia, nombre, apellido, dni);
				crudAlumno.addAlumno(alumno);

				break;
			case 2:

				System.out.println("Para modificar la nota media de un alumno introduzca su dni");
				dni = Leer.dato();

				System.out.println("Introduzca la nueva nota que quiere poner");
				nuevaNota = Leer.datoDouble();

				crudAlumno.modificarNotaAlumno(dni, nuevaNota);
				break;
			case 3:
				System.out.println("Para mostrar a un alumno introduzca su dni");
				dni = Leer.dato();

				crudAlumno.mostrarAlumno(dni);

				break;
			case 4:
				System.out.println("Para borrar a un alumno introduzca su dni");
				dni = Leer.dato();

				crudAlumno.borrarAlumno(dni);
				break;
			case 0:
				System.out.println("Ha salido, gracias por usar el programa");
				break;
			default:
				System.out.println("Introduzca la opción correcta");
				break;
			}
		} while (op != 0);
	}
}
