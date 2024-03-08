package ejemploLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class PrincipalLamda {
	public static void main(String[] args) {

		int dos = 2, z1 = 1;

		IInterfaz iInterfaz = (x) -> System.out.println(x);

		ISumar iInterfaz2 = z -> z + dos;

		System.out.println(iInterfaz2.sumarDos(z1));

		// Proveedor
		Supplier<Double> dador = () -> Math.random();

		System.out.println(dador.get());

		List<String> listaNombres = new ArrayList<String>();
		listaNombres.add("Victor");
		listaNombres.add("Fernando");
		listaNombres.add("Hugo");
		listaNombres.add("Manuel");
		listaNombres.add("Carlos");
		Consumer<String> mostrarLista = m -> System.out.println(m);
		for (String string : listaNombres) {
			mostrarLista.accept(string);
		}

	}
}
