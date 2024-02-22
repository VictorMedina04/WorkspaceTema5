package ejercicio05;

public class Persona implements Comparable<Persona> {

	private int edad;
	private String nombre;
	private String apellido;
	private String dni;

	public Persona(int edad, String nombre, String apellido, String dni) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}

	// El natural se le pasan una persona y el no natural se le pasan dos personas

	//
	public int compareTo(Persona persona) {

		return -(this.nombre.toLowerCase().compareTo(persona.getNombre().toLowerCase()));
	}
}
