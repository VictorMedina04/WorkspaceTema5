package ejercicioTipoExamenV2;

public class Palabra {

	private int id;
	private String nombre;
	private String significado;

	public Palabra(int id, String nombre, String significado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.significado = significado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSignificado() {
		return significado;
	}

	public void setSignificado(String significado) {
		this.significado = significado;
	}

	@Override
	public String toString() {
		return "Palabra [id=" + id + ", nombre=" + nombre + ", significado=" + significado + "]";
	}
}
