package ejercicioTipoExamen;

import java.util.Iterator;
import java.util.List;

public class Diccionario {

	private List<Palabra> listaPalabras;

	public Diccionario(List<Palabra> listaPalabras) {
		super();
		this.listaPalabras = listaPalabras;
	}

	public List<Palabra> getListaPalabras() {
		return listaPalabras;
	}

	public void setListaPalabras(List<Palabra> listaPalabras) {
		this.listaPalabras = listaPalabras;
	}

	@Override
	public String toString() {
		return "Diccionario [listaPalabras=" + listaPalabras + "]";
	}

	public void addPalabra(Palabra palabra) {
		listaPalabras.add(palabra);
	}

	public Palabra buscarPalabraPorNombre(String nombre) {

		for (Palabra palabra : listaPalabras) {

			if (palabra.getNombre().equalsIgnoreCase(nombre)) {
				return palabra;
			}
		}
		return null;
	}

	public void modificarPalabra(String nombre, String significadoNuevo) {
		buscarPalabraPorNombre(nombre).setSignificado(significadoNuevo);
	}

	public void borrarPalabra(String nombre) {
		listaPalabras.remove(buscarPalabraPorNombre(nombre));
	}

	public void imprimirDiccionario() {

		Iterator<Palabra> iteratorPalabra = listaPalabras.iterator();

		for (int i = 0; i < listaPalabras.size(); i++) {

			if (iteratorPalabra.hasNext()) {
				System.out.println(listaPalabras.get(i));
			}
		}

	}

}
