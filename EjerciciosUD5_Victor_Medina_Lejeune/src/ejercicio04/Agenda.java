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

	public void borrarContacto(String telefono) {
		listaContactos.remove(buscarContactoPorTelefono(telefono));
	}

//	public List<Contacto> buscarContactoPorNombre(String nombre) {
//
//		List<Contacto> listaContactoEncontrado = new ArrayList<Contacto>();
//
//		Set<Contacto> listaClaves = listaContactos.keySet();
//
//		for (Contacto contacto : listaClaves) {
//			if (contacto2.getNombre().equalsIgnoreCase(nombre)) {
//
//				listaContactoEncontrado.add(contacto);
//
//			}
//		}
//		return listaContactoEncontrado;
//
//	}

	public Contacto buscarContactoPorTelefono(String telefono) {

		Contacto contacto = null;

		for (Contacto contacto2 : listaContactos.keySet()) {
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

	public void modificarTelefonoDelContacto(String telefono, String nuevoTelefono) {

		buscarContactoPorTelefono(telefono).setTelefono(nuevoTelefono);

	}

	public void mostrarContacto(String telefono) {
		System.out.println(buscarContactoPorTelefono(telefono));
	}

	public void mostrarAgenda() {
		Set<Contacto> listaClaves = listaContactos.keySet();
		for (Contacto contacto : listaClaves) {
			System.out.println(listaContactos);
		}
	}

}
