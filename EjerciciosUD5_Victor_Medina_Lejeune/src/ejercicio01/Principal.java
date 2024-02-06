package ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {

		List<Nota> lista = new ArrayList<Nota>();
		CrudNota crudNota = new CrudNota(lista);

		crudNota.add(new Nota("Lorem Ipsum", "fyigwygfigwfu uiwhfuwh wuihfpuiv", 1));
		crudNota.add(new Nota("Lorem Ipsum", "ksbvkjs kjbswdvkjbmj bvndvsbn kl", 2));
		crudNota.add(new Nota("Lorem Ipsum", "vbobdkj lkldsoqew kjdo kjndjbnmds", 3));
		crudNota.add(new Nota("Lorem Ipsum", "vwig wofgwf gwf nvdnw uew fqcbsqi", 4));

		System.out.println(crudNota.contarNotas());
		crudNota.mostrarNotas();
		System.out.println("--------------------------------------------------------------------------------");

		crudNota.borrarNota(2);
		System.out.println(crudNota.contarNotas());
		crudNota.mostrarNotas();
	}
}
