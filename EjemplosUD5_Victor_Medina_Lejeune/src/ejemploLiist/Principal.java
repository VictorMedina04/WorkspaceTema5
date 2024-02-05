package ejemploLiist;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listado = new ArrayList<String>();
		listado.add("Ángel");
		listado.add("Rafa");
		listado.add("Juanjo");

		listado.contains("Rafa");
		System.out.println(listado.contains("Rafa"));

		System.out.println(listado);

		listado.remove(1);

		System.out.println(listado);

		System.out.println(listado.size());
		listado.remove(0);

		System.out.println(listado);

		System.out.println("\n\nCambio\n\n");

		List<Producto> listado2 = new ArrayList<Producto>();
		Producto p = new Producto("Lechuga", 1.99);
		Producto p2 = new Producto("Victor", 3);
		Producto p3 = new Producto("Carlos", 1);

		listado2.add(p);

		listado2.add(p2);

		System.out.println(listado2);

		System.out.println(listado2.contains(p3));

		listado2.remove(0);

		System.out.println(listado2);

	}

}
