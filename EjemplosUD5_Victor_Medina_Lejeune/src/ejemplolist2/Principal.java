package ejemplolist2;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Persona> listado = new ArrayList<Persona>();

		CrudPersona crudPersona = new CrudPersona(listado);

		crudPersona.addV2(new Persona(19, "4554624T", "Manuel"));
		crudPersona.addV2(new Persona(20, "5795473R", "Victor"));
		crudPersona.addV2(new Persona(19, "4567370E", "Carlos"));

		System.out.println("-------------------------------------------------");
		System.out.println(crudPersona.findByDni("5795473R"));
		System.out.println("-------------------------------------------------");
		crudPersona.imprimirLista();
		System.out.println("-------------------------------------------------");
		crudPersona.borrarPersona("4554624T");
		crudPersona.imprimirLista();
		System.out.println("-------------------------------------------------");

	}

}
