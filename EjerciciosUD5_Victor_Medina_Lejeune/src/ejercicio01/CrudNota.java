package ejercicio01;

import java.util.List;

public class CrudNota {

	private List<Nota> lista;

	public CrudNota(List<Nota> lista) {
		super();
		this.lista = lista;
	}

	public List<Nota> getLista() {
		return lista;
	}

	public void setLista(List<Nota> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudNota [lista=" + lista + "]";
	}

	public void add(Nota nota) {
		lista.add(nota);
	}

	public int contarNotas() {
		return lista.size();
	}

	public Nota buscarNotaById(int id) {
		boolean encontrado = false;
		Nota nota = null;
		for (int i = 0; i < lista.size() && !encontrado; i++) {
			if (lista.get(i).getId() == id) {
				nota = lista.get(i);
				encontrado = true;
			}
		}
		return nota;
	}

	public void borrarNota(int id) {
		if (buscarNotaById(id) != null) {
			lista.remove(buscarNotaById(id));
		}
	}

	public void mostrarNotas() {
		for (Nota nota : lista) {

			System.out.println(nota);
		}
	}

}
