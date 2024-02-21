package ejemploV2;

import java.util.List;

public class CRUDPersona {

	private List<Persona> listaPersona;

	public CRUDPersona(List<Persona> listaPersona) {
		super();
		this.listaPersona = listaPersona;
	}

	public List<Persona> getListaPersona() {
		return listaPersona;
	}

	public void setListaPersona(List<Persona> listaPersona) {
		this.listaPersona = listaPersona;
	}

	@Override
	public String toString() {
		return "CRUDPersona [listaPersona=" + listaPersona + "]";
	}

	public void addPersona(Persona persona) {

		listaPersona.add(persona);
	}

	public List<Persona> buscarPersonaPorNombre(String nombre) {

		// Buscar una persona
		// return listaPersona.stream().filter(persona ->
		// persona.getDni().equalsIgnoreCase(dni)).findAny().get();
		// Buscar varias personas
		return listaPersona.stream().filter(persona -> persona.getNombre().equalsIgnoreCase(nombre)).toList();
	}

	public List<Persona> buscarPersonaPorEdad(int edad) {

		listaPersona.stream().filter(persona -> persona.getEdad() == edad).t;
	}

	public void borrar() {
		listaPersona.stream().
	}

}
