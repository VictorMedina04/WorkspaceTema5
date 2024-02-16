package ejercicio04;

import java.util.Map;

public class Agenda {

	private Map<Contacto, Contacto> listaContactos;

	public Agenda(Map<Contacto, Contacto> listaContactos) {
		super();
		this.listaContactos = listaContactos;
	}

	// añadir,borrar,modificar,buscar,mostrar

	public void addContacto(Contacto contacto) {

		listaContactos.put(contacto, contacto);
	}

	public void borrarContacto(Contacto contacto) {
		listaContactos.remove(contacto);
	}

	public void buscarContactoPorNumeroTelefono(Telefono telefono) {

	}

	public void modificarContacto
	{

	}
}
