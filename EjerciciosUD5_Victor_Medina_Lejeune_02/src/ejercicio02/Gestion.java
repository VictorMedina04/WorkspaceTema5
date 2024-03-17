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

<<<<<<< HEAD
	public void mostrarLista(List<String> listas) {

		listas.stream().forEach(System.out::println);
	}

=======
	public void mostrarLista(List<String> lista) {
		lista.forEach(System.out::println);
	}

>>>>>>> 9233eeeb52c28befe1c2f6326f5c49995efb6792
	public List<String> ordenarAlfabeticamente() {

		return listaPalabras.stream().sorted().toList();
	}

	public String buscarCadenaPorTeclado(String string) {

		return listaPalabras.stream().filter(string1 -> string1.equalsIgnoreCase(string)).findFirst().get();
	}

	public List<String> buscarImpares() {
		return listaPalabras.stream().filter(string -> string.length() % 2 != 0).toList();
	}

	public void borrarImpares() {
		listaPalabras.removeAll(buscarImpares());
	}

	public List<String> convertirEnMayusculas() {

		return listaPalabras.stream().map(string -> string.toUpperCase()).toList();
	}
}
