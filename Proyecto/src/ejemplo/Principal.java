package ejemplo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Principal {
	public static void main(String[] args) {

		List<String> nombres = new ArrayList<>();
		Set<Integer> lista = new HashSet<>();
		List<>
		
		nombres.add("Manuel");
		nombres.add("Victor");
		nombres.add("Moises");
		nombres.add("Carlos");
		nombres.add("Joaquin");

		lista.add(2);
		lista.add(1);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		lista.add(7);

		nombres.stream().filter(nombre -> nombre.contains("e")).forEach(System.out::println);
		System.out.println();
		nombres.stream().limit(6).forEach(System.out::println);
		System.out.println();

		nombres.stream().limit(3).forEach(System.out::println);

		int cantidadNombres = (int) nombres.stream().limit(10).count();

		System.out.println(cantidadNombres);
	}
}
