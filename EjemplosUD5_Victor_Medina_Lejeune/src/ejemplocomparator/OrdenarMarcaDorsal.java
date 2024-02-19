package ejemplocomparator;

import java.util.Comparator;

public class OrdenarMarcaDorsal implements Comparator<Corredor> {

	@Override
	public int compare(Corredor c1, Corredor c2) {

		if (c1.getDorsal() < c2.getDorsal()) {
			return -1;
		} else {
			if (c1.getDorsal() > c2.getDorsal()) {
				return 1;
			}
		}

		if (c1.getMarca() < c2.getMarca()) {
			return -1;
		} else {
			if (c1.getMarca() > c2.getMarca()) {
				return 1;
			}
		}

		return 0;
	}

}
