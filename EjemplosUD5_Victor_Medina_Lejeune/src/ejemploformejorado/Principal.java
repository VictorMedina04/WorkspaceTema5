package ejemploformejorado;

public class Principal {
	public static void main(String[] args) {

		int[] numeros = { 1, 3, 5, 44, 9, 235, 35 };
		int suma = 0;

		// antes de los puntos va la variable de lo que es el array (no es contador es
		// un auxiliar para meter y sacar varibles)
		// dos puntos y dsp el nombre del array
		// recorre el array desde principio a fin sin parar
		// no es bueno editar el array con este for
		for (int valor : numeros) {
			suma += valor;

			System.out.println(valor);
		}

		System.out.println("La suma es:" + suma);

		// resultado = (condicion)?valor1:valor2;
		// sintaxis de un if else mejorado

	}
}
