package ejercicio03;

public class Plataforma {

	private CRUDAlumno crudAlumno;

	public Plataforma(CRUDAlumno crudAlumno) {
		super();
		this.crudAlumno = crudAlumno;
	}

	public CRUDAlumno getCrudAlumno() {
		return crudAlumno;
	}

	public void setCrudAlumno(CRUDAlumno crudAlumno) {
		this.crudAlumno = crudAlumno;
	}

	@Override
	public String toString() {
		return "Plataforma [crudAlumno=" + crudAlumno + "]";
	}

	// nota media,media suspensos, num suspensos

	public double calcularNotaMediaCurso() {
		double notaMedia = 0;

		for (Alumno alumno : crudAlumno.getListaAlumno()) {
			notaMedia += alumno.getNotaMedia();
		}
		return notaMedia / crudAlumno.getListaAlumno().size();
	}

	public int calcularNumeroDeSuspensos() {
		int cinco = 5;
		int contador = 0;
		for (Alumno alumno : crudAlumno.getListaAlumno()) {
			if (alumno.getNotaMedia() < cinco) {
				contador++;
			}
		}
		return contador;
	}

	public double calcularMediaSuspensos() {
		double notaMediaSuspensos = 0;
		int cinco = 5;

		for (Alumno alumno : crudAlumno.getListaAlumno()) {
			if (alumno.getNotaMedia() < cinco)
				notaMediaSuspensos += alumno.getNotaMedia();
		}

		return notaMediaSuspensos / calcularNumeroDeSuspensos();

	}
}
