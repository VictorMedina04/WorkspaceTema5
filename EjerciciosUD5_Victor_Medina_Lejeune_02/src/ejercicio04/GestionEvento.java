package ejercicio04;

import java.time.LocalDate;
import java.time.LocalTime;

public class GestionEvento {

	private FinalChampions fc;

	public GestionEvento(FinalChampions fc) {
		super();
		this.fc = fc;
	}

	public FinalChampions getFc() {
		return fc;
	}

	public void setFc(FinalChampions fc) {
		this.fc = fc;
	}

	public LocalTime calcularHoraApertura(int horas) {
		return fc.getHora().minusHours(horas);
	}

	public int calcularTiempoDesdeLaUltimaFinal(int ultimaFinal) {
		return fc.getDia().getYear() - ultimaFinal;
	}

	public int calcularTiempoParaLaFinal() {
		LocalDate hoy = LocalDate.now();
		LocalDate diaDeLaFinal = fc.getDia();

		return diaDeLaFinal.getDayOfYear() - hoy.getDayOfYear();
	}

}
