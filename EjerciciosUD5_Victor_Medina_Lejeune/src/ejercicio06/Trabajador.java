package ejercicio06;

public class Trabajador implements Comparable<Trabajador> {

	private String nombre;
	private String dni;
	private int horasTrabajadas;
	private double sueldoFinal;

	public Trabajador(String nombre, String dni, int horasTrabajadas, double sueldoFinal) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.horasTrabajadas = horasTrabajadas;
		this.sueldoFinal = sueldoFinal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getSueldoFinal() {
		return sueldoFinal;
	}

	public void setSueldoFinal(double sueldoFinal) {
		this.sueldoFinal = sueldoFinal;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", horasTrabajadas=" + horasTrabajadas
				+ ", sueldoFinal=" + sueldoFinal + "]";
	}

	@Override
	public int compare(Trabajador trabajador) {
		ComparaPorHoras comparaPorHoras = new ComparaPorHoras();
		if (this.getSueldoFinal() < trabajador.getSueldoFinal()) {
			return -1;
		} else {
			if (this.getSueldoFinal() > trabajador.getSueldoFinal()) {
				return 1;
			}
		}
		return 0;
	}
}
