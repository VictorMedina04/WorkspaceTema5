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

		listaContactos.put(contacto, telefono);
	}

	public void borrarContacto(Contacto contacto) {
		listaContactos.remove(contacto);
	}

	public Contacto buscarContactoPorNombre(String nombre) {

		Contacto contacto = null;

		Set<Contacto> listaClaves = listaContactos.keySet();

		for (Contacto contacto2 : listaClaves) {
			if (contacto2.getNombre().equals(nombre)) {
				contacto = contacto2;
			}
		}
		return contacto;

	}

	public void modificarContacto(String nombre) {

	}

	public void mostrarContactos() {

	}
}
