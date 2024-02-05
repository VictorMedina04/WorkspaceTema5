package ejemplolist2;

import java.util.List;

public class CrudPersona {

	private List<Persona> lista;

	public CrudPersona(List<Persona> lista) {
		super();
		this.lista = lista;
	}

	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudPersona lista=" + lista + "";
	}

	// Nunca creamos un agregar pasando los atriubutos sueltos del objeto
	public boolean addV2(Persona persona) {
		return lista.add(persona);
	}

	public Persona findByDni(String dni) {
		int i = 0;
		boolean encontrado = false;

		while (i < lista.size() && !encontrado) {
			Persona deLista = lista.get(i);
			if (deLista.getDni().equalsIgnoreCase(dni)) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return lista.get(i);
		} else {
			return null;
		}
	}

	public void imprimirLista() {
		for (Persona persona : lista) {
			System.out.println(persona);
		}
	}

	public void borrarPersona(String dni) {
		lista.remove(findByDni(dni));
	}
}
