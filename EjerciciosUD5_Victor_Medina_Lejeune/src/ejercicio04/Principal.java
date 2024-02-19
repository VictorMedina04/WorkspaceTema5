package ejercicio04;

import java.util.HashMap;
import java.util.Map;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

<<<<<<< HEAD
		Map<Contacto, String> agenda = new HashMap<Contacto, String>();
=======
		Map<Contacto, String> listaContactos = new HashMap<Contacto, String>();
>>>>>>> b3018301bd56680bb66e32d7ed17f9643b6456e2

		Agenda agenda = new Agenda(listaContactos);
		int op;
		String telefono, nombre, apellido, nuevoNombre, nuevoApellido, nuevoTelefono;

		do {
			System.out.println("""
					1-Añadir
					2-Modificar nombre
					3-Modificar apellido
					4-Modificar telefono
					5-Borrar contacto
					6-Mostrar contacto
					7-Mostrar agenda
					0-Salir
					""");
			op = Leer.datoInt();
			switch (op) {
			case 1:
				System.out.println("Añadir un contacto");
				System.out.println("Introduzca el nombre");
				nombre = Leer.dato();
				System.out.println("Introduzca el apellido");
				apellido = Leer.dato();
				System.out.println("Introduzca el telefono");
				telefono = Leer.dato();
				Contacto contacto = new Contacto(nombre, apellido, telefono);
				agenda.addContacto(contacto, telefono);
				break;
			case 2:

				System.out.println("Introduzca el telefono del contacto que quiere modificar");
				telefono = Leer.dato();
				System.out.println("Introduzca el nuevo nombre");
				nuevoNombre = Leer.dato();
				agenda.modificarNombreDelContacto(telefono, nuevoNombre);
				break;
			case 3:
				System.out.println("Introduzca el telefono del contacto que quiere modificar");
				telefono = Leer.dato();
				System.out.println("Introduzca el nuevo apellido");
				nuevoApellido = Leer.dato();
				agenda.modificarApellidoDelContacto(telefono, nuevoApellido);
				break;
			case 4:
				System.out.println("Introduzca el nombre del contacto que quiere modificar");
				nombre = Leer.dato();
				System.out.println("Introduzca el nuevo telefono");
				nuevoTelefono = Leer.dato();
				agenda.modificarTelefonoDelContacto(nombre, nuevoTelefono);
				break;
			case 5:
				System.out.println("Introduzca el nombre del contacto que quiere borrar");
				nombre = Leer.dato();
				agenda.borrarContacto(nombre);
				break;
			case 6:
				System.out.println("Introduzca el nombre del contacto que quiere mostrar");
				nombre = Leer.dato();
				agenda.mostrarContacto(nombre);
				break;
			case 7:
				agenda.mostrarAgenda();
				break;
			case 0:
				System.out.println("Ha salido");
				break;
			default:
				System.out.println("Introduzca una opción correcta");
				break;
			}
		} while (op != 0);
	}

}
