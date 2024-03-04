package ejercicioExamenV2;

import java.util.ArrayList;
import java.util.List;

public class Oficina {

	List<Trastero> listaTrasteros;

	public Oficina(List<Trastero> listaTrasteros) {
		super();
		this.listaTrasteros = listaTrasteros;
	}

	public List<Trastero> getListaTrasteros() {
		return listaTrasteros;
	}

	public void setListaTrasteros(List<Trastero> listaTrasteros) {
		this.listaTrasteros = listaTrasteros;
	}

	@Override
	public String toString() {
		return "Oficina [listaTrasteros=" + listaTrasteros + "]";
	}

	public void addTrastero(Trastero trastero) {
		listaTrasteros.add(trastero);
	}

	public List<Trastero> buscarTrasteroPorPrecio(double precio) {
		List<Trastero> listaPrecio = new ArrayList<Trastero>();
		for (Trastero trastero : listaTrasteros) {
			if (trastero.getPrecio() == precio) {
				listaPrecio.add(trastero);
			}
		}
		return listaPrecio;
	}

	public Trastero buscarTrasteroPorNumero(int numTrastero) {
		for (Trastero trastero : listaTrasteros) {
			if (trastero.getNumTrastero() == numTrastero) {
				return trastero;
			}
		}
		return null;
	}

	public Trastero buscarTrasteroMasCaro() {
		Trastero trasteroMasCaro = new Trastero();
		for (Trastero trastero : listaTrasteros) {
			if (trastero.getPrecio() > trasteroMasCaro.getPrecio()) {
				trasteroMasCaro = trastero;
			}
		}
		return trasteroMasCaro;
	}

	public void eliminarTrastero(int numTrastero) {

		listaTrasteros.remove(buscarTrasteroPorNumero(numTrastero));
	}

	public void modificarPrecioTrastero(int numTrastero, double precioNuevo) {
		buscarTrasteroPorNumero(numTrastero).setPrecio(precioNuevo);
	}

	public void mostrarNoOcupados() {
		for (Trastero trastero : listaTrasteros) {
			if (!trastero.isOcupado()) {
				System.out.println(trastero);
			}
		}
	}

}
