package ejemploV2;

import java.util.ArrayList;
import java.util.List;

public class Ppa {

	public static void main(String[] args) {

		List<Persona> listaPersonas = new ArrayList<Persona>();

		CRUDPersona crudPersona = new CRUDPersona(listaPersonas);

		Persona persona = new Persona("manuel", "gomez", "3252646R", 19);
		Persona persona1 = new Persona("victor", "medina", "4678434P", 18);
		Persona persona2 = new Persona("victor", "roman", "2366463O", 20);
		Persona persona3 = new Persona("moises", "dorado", "4263457Y", 32);

		crudPersona.addPersona(persona);
		crudPersona.addPersona(persona1);
		crudPersona.addPersona(persona2);
		crudPersona.addPersona(persona3);

		System.out.println(crudPersona.buscarPersonaPorNombre("victor"));

	}

}
