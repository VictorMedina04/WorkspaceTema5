package ejemplolist2;

public class Persona {

	private int edad;
	private String dni;
	private String nombre;

	public Persona(int edad, String dni, String nombre) {
		super();
		this.edad = edad;
		this.dni = dni;
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona edad=" + edad + " dni=" + dni + " nombre=" + nombre + "";
	}

}
