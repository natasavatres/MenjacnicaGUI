package menjacnica;

import java.util.LinkedList;

public class Menjacnica implements MenjacnicaInterfejs {

	LinkedList<Kurs> listaKurseva = new LinkedList<>();

	@Override
	public void dodajKurs(Kurs k) {
		if (k == null)
			throw new RuntimeException("Greska");

		if (!listaKurseva.contains(k)) {
			listaKurseva.add(k);
		} else {
			return;
		}

	}

	@Override
	public void izbrisiKurs(Kurs k) {
		if (k == null)
			throw new RuntimeException("Greska");

		if (listaKurseva.contains(k)) {
			listaKurseva.remove(k);
		}

	}

	@Override
	public Kurs vratiKurs(String naziv) {
		for (int i = 0; i < listaKurseva.size(); i++) {
			if (listaKurseva.get(i).getNaziv().equals(naziv)) {
				return listaKurseva.get(i);
			}
		}
		return null;
	}

	@Override
	public LinkedList<Kurs> vratiListuKurseva() {
		return listaKurseva;
	}

}
