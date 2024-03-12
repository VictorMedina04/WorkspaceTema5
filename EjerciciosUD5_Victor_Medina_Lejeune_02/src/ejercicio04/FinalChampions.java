package ejercicio04;

import java.time.LocalDate;
import java.time.LocalTime;

public class FinalChampions {
	private LocalDate dia;
	private LocalTime hora;

	public FinalChampions(LocalDate dia, LocalTime hora) {
		super();
		this.dia = dia;
		this.hora = hora;
	}

	public LocalDate getDia() {
		return dia;
	}

	public void setDia(LocalDate dia) {
		this.dia = dia;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "FinalChampions [dia=" + dia + ", hora=" + hora + "]";
	}

}
