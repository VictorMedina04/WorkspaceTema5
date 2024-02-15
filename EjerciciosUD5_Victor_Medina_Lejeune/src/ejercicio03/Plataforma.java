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
}
