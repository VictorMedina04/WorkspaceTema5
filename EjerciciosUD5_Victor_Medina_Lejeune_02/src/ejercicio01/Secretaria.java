package ejercicio01;

import java.util.Comparator;
import java.util.List;

public class Secretaria {

	private List<Alumno> listaAlumno;

	public Secretaria(List<Alumno> listaAlumno) {
		super();
		this.listaAlumno = listaAlumno;
	}

	public List<Alumno> getListaAlumno() {
		return listaAlumno;
	}

	public void setListaAlumno(List<Alumno> listaAlumno) {
		this.listaAlumno = listaAlumno;
	}

	@Override
	public String toString() {
		return "Secretaria [listaAlumno=" + listaAlumno + "]";
	}

	public void addAlumno(Alumno alumno) {
		listaAlumno.add(alumno);
	}

	public void mostrarLista() {
		listaAlumno.stream().forEach(System.out::println);
	}

	public void mostrarAlumnosEmpiecenPorXLetra(String letra) {
		listaAlumno.stream().filter(alumno -> alumno.getNombre().startsWith(letra)).forEach(System.out::println);
	}

	public Long contarTamayoLista() {
		return listaAlumno.stream().count();
	}

	public List<Alumno> calcularAlumnosMayorQueNueve() {

		return listaAlumno.stream().filter(alumno -> alumno.getNotaMedia() > 9).toList();
	}

	public void mostrarTresPrimeros() {
		listaAlumno.stream().limit(3).forEach(System.out::println);
	}

	public Alumno obtenerAlumnoMenorEdad() {
		Comparator<Alumno> compararEdad = Comparator.comparing(Alumno::getEdad);
		return listaAlumno.stream().min(compararEdad).get();

	}

	public Alumno obtenerPrimerAlumno() {
		return listaAlumno.stream().findFirst().get();
	}

	public List<Alumno> obtenerNombresMayorADiez() {
		return listaAlumno.stream().filter(alumno -> alumno.getNombre().length() > 10).toList();
	}

	public List<Alumno> obtenerNombresMayorASeisYEmpiecenPorA() {
		return listaAlumno.stream()
				.filter(alumno -> alumno.getNombre().length() <= 6 && alumno.getNombre().startsWith("A")).toList();
	}

}
