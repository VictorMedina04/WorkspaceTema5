package ejemploset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Principal {
	public static void main(String[] args) {

		List<Persona> lista = new ArrayList<Persona>();
		Set<String> lista2 = new HashSet<String>();

		lista2.add("uno");
		lista2.add("dos");
		lista2.add("cuatro");
		lista2.add("tres");
		lista2.add("uno");
		lista2.add("cuatro");
		lista2.add("dos");
		lista2.add("tres");
		lista2.add("cinco");
		lista2.add("seis");

		System.out.println(lista2);

		lista2.remove("cinco");
		lista2.remove("seis");

		System.out.println(lista2);
		System.out.println(lista2.contains("uno"));

		lista.add(new Persona(19, "43643F", "Victor"));
		lista.add(new Persona(19, "24544R", "Manuel"));
		lista.add(new Persona(32, "24524F", "Fernando"));
		lista.add(new Persona(23, "24524F", "Fernando"));
		CrudPersona crudPersona = new CrudPersona(lista);
		System.out.println(crudPersona.buscarPorDni("24524F"));
		System.out.println(lista);
	}
}