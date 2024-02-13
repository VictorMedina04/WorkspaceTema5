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

	public double pagarCuota(String dni, double pagado) {
		double vuelta;
		if (pagado > crudSocio.buscarSocioPorDni(dni).getCuotaBase()) {
			vuelta = pagado;
		} else {
			vuelta = crudSocio.buscarSocioPorDni(dni).getCuotaBase() - pagado;
		}
		return vuelta;

	}

}
