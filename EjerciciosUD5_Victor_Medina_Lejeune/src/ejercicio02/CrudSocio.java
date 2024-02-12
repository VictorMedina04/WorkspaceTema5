package ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class CrudSocio {

	private List<Socio> listaSocios = new ArrayList<Socio>();

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
		return "CrudSocio [listaSocios=" + listaSocios + "]";
	}

	public Socio buscarSocioPorDni(String dni) {
		boolean encontrado = false;
		Socio socio = null;
		for (int i = 0; i < listaSocios.size() && !encontrado; i++) {

			if (socio.getDni().equalsIgnoreCase(dni)) {
				encontrado = true;
				socio = listaSocios.get(i);
			}
		}
		return socio;
	}

	public void mostrarDatos() {
		for (Socio socio : listaSocios) {
			System.out.println(listaSocios);
		}
	}

	public void modificarSocio(String dni, double nuevaCuota) {

		for (Socio socio : listaSocios) {
			listaSocios.get(buscarSocioPorDni(dni).setCuotaBase(nuevaCuota));
		}

	}

	public void borrarSocio(String dni) {
		listaSocios.remove(buscarSocioPorDni(dni));
	}

}
