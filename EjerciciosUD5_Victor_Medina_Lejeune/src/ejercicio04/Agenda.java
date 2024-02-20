package ejercicio04;

import java.util.Map;
import java.util.Set;

public class Agenda {

	private Map<Contacto, String> listaContactos;

	public Agenda(Map<Contacto, String> listaContactos) {
		super();
		this.listaContactos = listaContactos;
	}

	// añadir,borrar,modificar,buscar,mostrar

	public void addContacto(Contacto contacto, String telefono) {
		listaContactos.put(contacto, contacto.getTelefono());
	}

	public void borrarContacto(String nombre) {
		listaContactos.remove(buscarContactoPorNombre(nombre));
	}

	public Contacto buscarContactoPorNombre(String nombre) {

		Contacto contacto = null;

		Set<Contacto> listaClaves = listaContactos.keySet();

		for (Contacto contacto2 : listaClaves) {
			if (contacto2.getNombre().equalsIgnoreCase(nombre)) {

				contacto = contacto2;
			}
		}
		return contacto;

	}

	public Contacto buscarContactoPorTelefono(String telefono) {

		Contacto contacto = null;
		Set<Contacto> listaClaves = listaContactos.keySet();

		for (Contacto contacto2 : listaClaves) {
			if (contacto2.getTelefono().equalsIgnoreCase(telefono)) {
				contacto = contacto2;
			}
		}
		return contacto;
	}

	public void modificarNombreDelContacto(String telefono, String nuevoNombre) {

		buscarContactoPorTelefono(telefono).setNombre(nuevoNombre);

	}

	public void modificarApellidoDelContacto(String telefono, String nuevoApellido) {

		buscarContactoPorTelefono(telefono).setApellido(nuevoApellido);

	}

	public void modificarTelefonoDelContacto(String nombre, String nuevoTelefono) {

		buscarContactoPorNombre(nombre).setTelefono(nuevoTelefono);

	}

	public void mostrarContacto(String nombre) {
		System.out.println(buscarContactoPorNombre(nombre));
	}

	public void mostrarAgenda() {
		Set<Contacto> listaClaves = listaContactos.keySet();
		for (Contacto contacto : listaClaves) {
			System.out.println(listaContactos);
		}
	}

}
