package ejemploset;

import java.util.Set;

public class CrudPersona {

	private Set<Persona> lista;

	public Persona buscarPorDni() {
		boolean encontrado = false;

		for (Persona persona : lista) {
			if (lista.contains(persona)) {
				encontrado = true;
			}

		}
	}
}
