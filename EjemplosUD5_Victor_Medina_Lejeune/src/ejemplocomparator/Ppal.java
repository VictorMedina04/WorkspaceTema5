package ejemplocomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ppal {

	public static void main(String[] args) {

		List<Corredor> corredores = new ArrayList<>();

		corredores.add(new Corredor(4, 1.43, "Jesse"));
		corredores.add(new Corredor(8, 1.11, "Ángel Narananjo"));
		corredores.add(new Corredor(3, 2.23, "Abel Antón"));
		corredores.add(new Corredor(4, 2.23, "Abel Antón"));
		corredores.add(new Corredor(1, 1.12, "Luismi"));
		corredores.add(new Corredor(6, 1.13, "Miguel Campos"));

		// Ordenar de forma natural
		System.out.println("Ordenar de forma natural");

		Collections.sort(corredores);

		for (Corredor cor : corredores) {
			System.out.println(cor);
		}

		System.out.println();
		// Ordenar de forma no natural. En este caso necesito pasar 2 parámetros, la
		// lista y un objeto de la clase donde he creado el comparar

		System.out.println("Ordenar de forma no natural por marca");
		Collections.sort(corredores, new CompararPorMarca());

		for (Corredor corredor : corredores) {
			System.out.println(corredor);
		}
		System.out.println();
		System.out.println("Ordenar de forma no natural, por nombre con un String");
		Collections.sort(corredores, new ComparaNombre());
		for (Corredor corredor : corredores) {
			System.out.println(corredor);
		}

		System.out.println();
		System.out.println("Ordenar por Marca y Dorsal");
		Collections.sort(corredores, new OrdenarMarcaDorsal());
		for (Corredor corredor : corredores) {
			System.out.println(corredor);
		}
	}

}