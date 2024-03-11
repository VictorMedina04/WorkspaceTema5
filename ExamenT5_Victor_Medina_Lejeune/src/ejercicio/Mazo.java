package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {

	private List<Carta> listaCarta;

	public Mazo(List<Carta> listaCarta) {
		super();
		this.listaCarta = listaCarta;
	}

	public List<Carta> getListaCarta() {
		return listaCarta;
	}

	public void setListaCarta(List<Carta> listaCarta) {
		this.listaCarta = listaCarta;
	}

	@Override
	public String toString() {
		return "Mazo [listaCarta=" + listaCarta + "]";
	}

	public void addCarta(Carta carta) {
		listaCarta.add(carta);
	}

	public Carta buscarCartaPorNumeroYPalo(int numCarta, String palo) {

		for (Carta carta : listaCarta) {
			if (carta.getNumCarta() == numCarta && carta.getPalo().equalsIgnoreCase(palo)) {
				return carta;
			}

		}
		return null;

	}

	public List<Carta> buscarValorCero() {

		// Iterator itCarta = Iterator<Carta>;

		List<Carta> listaEncontrado = new ArrayList<Carta>();

		for (Carta carta : listaCarta) {
			if (carta.calcularValorCarta() == 0) {
				listaEncontrado.add(carta);
			}
		}

//		for (int i = 0; i < listaCarta.size(); i++) {
//			if (itCarta.hasNext() && listaCarta.get(i).calcularValorCarta() == 0) {
//				listaEncontrado.add(listaCarta.get(i));
//			}
//		}
		return listaEncontrado;

	}

	public int calcularPuntuacionTotal() {

		int puntuacionTotal = 0;
		for (Carta carta : listaCarta) {

			puntuacionTotal = puntuacionTotal + carta.calcularValorCarta();
		}
		return puntuacionTotal;
	}

	public void modificarNombre(int numCarta, String palo, String nombreNuevo) {

		buscarCartaPorNumeroYPalo(numCarta, palo).setNombre(nombreNuevo);
	}

	public void mostrarLista() {
//		Iterator<Carta> itCarta = Iterator<Carta>;
//		for (int i = 0; i < listaCarta.size(); i++) {
//			if(itCarta.hasNext()) {
//				System.out.println(listaCarta.get(i));
//			}
//		}
		for (Carta carta : listaCarta) {
			System.out.println(carta + "\n");
		}
	}

	public void ordenarNatural() {

		Collections.sort(listaCarta);

	}

	public void ordenarNoNatural() {

		Collections.sort(listaCarta, new OrdenarPorPuntuacion());

	}

}
