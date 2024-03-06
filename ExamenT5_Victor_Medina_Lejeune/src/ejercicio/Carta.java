package ejercicio;

public class Carta implements Comparable<Carta> {

	private String nombre;
	private String palo;
	private int numCarta;

	public Carta(String nombre, String palo, int numCarta) {
		super();
		this.nombre = nombre;
		this.palo = palo;
		this.numCarta = numCarta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public int getNumCarta() {
		return numCarta;
	}

	public void setNumCarta(int numCarta) {
		this.numCarta = numCarta;
	}

	@Override
	public String toString() {
		return "Carta [nombre=" + nombre + ", palo=" + palo + ", numCarta=" + numCarta + "]";
	}

	public int calcularValorCarta() {

		int valorCarta = 0;
		int diez = 10;
		if (!nombre.equalsIgnoreCase("As") && !nombre.equalsIgnoreCase("Tres") && numCarta < diez) {
			return valorCarta = 0;
		} else {
			if (numCarta < diez && nombre.equalsIgnoreCase("As")) {
				return valorCarta = 11;
			} else {
				if (numCarta < diez && nombre.equalsIgnoreCase("Tres")) {
					return valorCarta = 10;
				} else {
					if (numCarta == 10) {
						return valorCarta = 2;
					} else {
						if (numCarta == 11) {
							return valorCarta = 3;
						} else {
							if (numCarta == 12) {
								return valorCarta = 4;
							}
						}
					}
				}
			}
		}
		return valorCarta;

	}

	@Override
	public int compareTo(Carta carta) {

		return -(this.palo.toLowerCase().compareTo(carta.getPalo().toLowerCase()));
	}
}
