package ejercicio03;

public class Alumno {

	private double notaMedia;
	private String nombre;
	private String Apellido;
	private String dni;

	public Alumno(double notaMedia, String nombre, String apellido, String dni) {
		super();
		this.notaMedia = notaMedia;
		this.nombre = nombre;
		Apellido = apellido;
		this.dni = dni;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Alumno [nota=" + notaMedia + ", nombre=" + nombre + ", Apellido=" + Apellido + ", dni=" + dni + "]";
	}

}
