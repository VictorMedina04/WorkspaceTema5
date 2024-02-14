package ejemplocomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ppal {
	public static void main(String[] args) {

		List<Corredor> listaCorredores = new ArrayList<Corredor>();

		listaCorredores.add(new Corredor(1, 0.1, "Victor Medina"));
		listaCorredores.add(new Corredor(2, 3.33, "Manuel Gomez"));
		listaCorredores.add(new Corredor(3, 2.1, "Moises"));
		listaCorredores.add(new Corredor(4, 6.3, "Bruno"));
		listaCorredores.add(new Corredor(5, 2.8, "Joaquin"));
		listaCorredores.add(new Corredor(6, 1.43, "Carlos"));
		listaCorredores.add(new Corredor(7, 0.001, "Luismi"));
		listaCorredores.add(new Corredor(8, 0.5, "Angel"));
		listaCorredores.add(new Corredor(9, 0.3, "Miguel"));

		// Comparar
		Collections.sort(listaCorredores);
		Collections.sort(listaCorredores, new CompararPorMarca());

	}
}
