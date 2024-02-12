package ejercicio02;

public class Socio {

	private String nombre;
	private String apellidos;
	private String dni;
	private double cuotaBase;

	public Socio(String nombre, String apellidos, String dni, double cuotaBase) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.cuotaBase = cuotaBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getCuotaBase() {
		return cuotaBase;
	}

	public void setCuotaBase(double cuotaBase) {
		this.cuotaBase = cuotaBase;
	}

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", cuotaBase=" + cuotaBase
				+ "]";
	}

}
