package ejercicio02;

import java.util.List;

public class Gestion {

	List<String> listaPalabras;

	public Gestion(List<String> listaPalabras) {
		super();
		this.listaPalabras = listaPalabras;
	}

	public List<String> getListaPalabras() {
		return listaPalabras;
	}

	public void setListaPalabras(List<String> listaPalabras) {
		this.listaPalabras = listaPalabras;
	}

	@Override
	public String toString() {
		return "Gestion [listaPalabras=" + listaPalabras + "]";
	}

//	* Crear un nuevo String formado por la primera letra de cada palabra que contiene la lista.
//	* Pasar todas las palabras a mayúsculas.

	public void addPalabra(String palabra) {
		listaPalabras.add(palabra);
	}

	public void ordenarAlfabeticamente() {

		listaPalabras.stream().sorted().toList();
	}

	public String buscarCadenaPorTeclado(String string) {

		return listaPalabras.stream().filter(string1 -> string1.equalsIgnoreCase(string)).findFirst().get();
	}

	public void borrarImpares() {

		listaPalabras.stream().filter(string -> string.length() % 2 != 0).toList();
	}

	public List<String> convertirEnMayusculas() {

		return listaPalabras.stream().map(string -> string.toUpperCase()).toList();
	}
}
