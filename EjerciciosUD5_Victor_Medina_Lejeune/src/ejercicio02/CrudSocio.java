package ejercicio02;

import java.util.List;

public class CrudSocio {

	private List<Socio> listaSocios;

	public CrudSocio(List<Socio> listaSocios) {
		super();
		this.listaSocios = listaSocios;
	}

	public List<Socio> getListaSocios() {
		return listaSocios;
	}

	public void setListaSocios(List<Socio> listaSocios) {
		this.listaSocios = listaSocios;
	}

	@Override
	public String toString() {
		return "listaSocios=" + listaSocios + "";
	}

	public Socio buscarSocioPorDni(String dni) {
		boolean encontrado = false;
		Socio socio = null;

		for (Socio socio1 : listaSocios) {
			if (socio1.getDni().equalsIgnoreCase(dni)) {
				encontrado = true;
				socio = socio1;
			}

		}
		return socio;
	}

	public void addSocio(Socio socio) {
		listaSocios.add(socio);
	}

	public void mostrarSocios() {
		System.out.println(listaSocios);
	}

	public void modificarSocio(String dni, double nuevaCuota) {
		buscarSocioPorDni(dni).setCuotaBase(nuevaCuota);
	}

	public void borrarSocio(String dni) {
		listaSocios.remove(buscarSocioPorDni(dni));
	}

}
