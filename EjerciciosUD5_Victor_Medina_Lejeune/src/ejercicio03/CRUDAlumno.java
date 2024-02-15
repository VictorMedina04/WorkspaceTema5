package ejercicio03;

import java.util.Set;

public class CRUDAlumno {

	Set<Alumno> listaAlumno;

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
		Alumno alumnoIgual = null;
		for (Alumno alumno : listaAlumno) {
			if (alumno.getDni().equalsIgnoreCase(dni)) {
				alumnoIgual = alumno;
			}
		}
		return alumnoIgual;
	}

	public void modificarNotaAlumno(String dni, double notaNueva) {

		buscarAlumnoPorDNI(dni).setNotaMedia(notaNueva);
	}

	public void mostrarAlumno(String dni) {

		if (buscarAlumnoPorDNI(dni) == null) {
			System.out.println("El alumno no esta en la lista");
		} else {
			System.out.println(buscarAlumnoPorDNI(dni));
		}

	}

	public void borrarAlumno(String dni) {

		listaAlumno.remove(buscarAlumnoPorDNI(dni));
	}

}
