package ejemploset;

import java.util.Objects;

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
		return "edad=" + edad + " dni=" + dni + " nombre=" + nombre + "";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni) && edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	
	

}
