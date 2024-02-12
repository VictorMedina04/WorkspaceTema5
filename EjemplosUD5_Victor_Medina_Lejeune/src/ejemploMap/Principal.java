package ejemploMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {

//		Map<String, String> lista = new HashMap<String, String>();
//		Set<String> lista2 = lista.keySet();
//		Collection<String> lista3 = lista.values();
//
//		lista.put("Uno", "1ro");
//		lista.put("Dos", "2do");
//		lista.put("Tres", "3ro");
//		// lista.put("Uno", "Primero");
//		lista.put("Cuatro", "1ro");
//
//		System.out.println(lista);
//
//		System.out.println(lista2);
//
//		System.out.println(lista3);
//
//		Set<Entry<String, String>> lista4 = lista.entrySet();
//		System.out.println(lista2 + "\n" + collection + "\n" + lista4);

		Map<Integer, Alumno> lista = new HashMap<Integer, Alumno>();

		Alumno alumno = new Alumno(1, 5, "Manueh");
		lista.put(3, alumno);
		System.out.println(lista);

		// Para sacar las llaves
		Set<Integer> listaLlave = lista.keySet();
		// Para sacar los valores
		Collection<Alumno> listaValor = lista.values();

		System.out.println(listaLlave);
		System.out.println(listaValor);

	}

}
