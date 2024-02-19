package ejercicio03;

import java.util.Set;

public class CRUDAlumno {

	private Set<Alumno> listaAlumno;

	public CRUDAlumno(Set<Alumno> listaAlumno) {
		super();
		this.listaAlumno = listaAlumno;
	}

	public Set<Alumno> getListaAlumno() {
		return listaAlumno;
	}

	public void setListaAlumno(Set<Alumno> listaAlumno) {
		this.listaAlumno = listaAlumno;
	}

	@Override
	public String toString() {
		return "CRUDAlumno [listaAlumno=" + listaAlumno + "]";
	}

	public void addAlumno(Alumno alumno) {
		listaAlumno.add(alumno);
	}

	public Alumno buscarAlumnoPorDNI(String dni) {

		for (Alumno alumno : listaAlumno) {
			if (alumno.getDni().equalsIgnoreCase(dni)) {
				return alumno;
			}
		}
		return null;
	}

	public void modificarNotaAlumno(String dni, double notaNueva) {

		buscarAlumnoPorDNI(dni).setNotaMedia(notaNueva);
	}

	public void mostrarAlumnos() {

		for (Alumno alumno : listaAlumno) {
			System.out.println(alumno);
		}
	}

	public void borrarAlumno(String dni) {

		listaAlumno.remove(buscarAlumnoPorDNI(dni));
	}

}
