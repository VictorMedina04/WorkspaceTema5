package ejercicio02;

public class Club {

	private CrudSocio crudSocio;

	public Club(CrudSocio crudSocio) {
		super();
		this.crudSocio = crudSocio;
	}

	public CrudSocio getCrudSocio() {
		return crudSocio;
	}

	public void setCrudSocio(CrudSocio crudSocio) {
		this.crudSocio = crudSocio;
	}

	@Override
	public String toString() {
		return "Club [crudSocio=" + crudSocio + "]";
	}

	// Falta decir el socio que lo va ha hacer
//	public double alquilarPista(double precioPista, int horas) {
//
//		crudSocio.buscarSocioPorDni(dni);
//
//		return horas * precioPista;
//	}
//
//	public double pagarCuota(String dni, double pagado) {
//		double vuelta;
//		double cuotaSocio = crudSocio.buscarSocioPorDni(dni).getCuotaBase();
//		if (pagado > cuotaSocio) {
//			vuelta = pagado;
//		} else {
//			vuelta = cuotaSocio - pagado;
//		}
//		return vuelta;
//
//	}

}
