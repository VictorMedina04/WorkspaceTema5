package ejemplocomparator;

import java.util.Comparator;

public class CompararPorMarca implements Comparator<Corredor> {

	public int compare(Corredor corredor, Corredor corredor2) {
		if (corredor.getMarca() < corredor2.getMarca()) {
			return -1;
		} else {
			if (corredor.getDorsal() > corredor2.getMarca()) {
				return 1;
			}
			return 0;
		}
	}
}
