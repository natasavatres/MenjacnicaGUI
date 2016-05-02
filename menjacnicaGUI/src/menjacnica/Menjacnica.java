package menjacnica;

import java.util.LinkedList;

public class Menjacnica implements MenjacnicaInterfejs {

	LinkedList<Kurs> kursnaLista = new LinkedList<>();

	@Override
	public void dodajKurs(Kurs k) {
		if (k == null)
			throw new RuntimeException("Greska");

		if (!kursnaLista.contains(k)) {
			kursnaLista.add(k);
		} else {
			return;
		}

	}

	@Override
	public void izbrisiKurs(Kurs k) {
		if (k == null)
			throw new RuntimeException("Greska");

		if (kursnaLista.contains(k)) {
			kursnaLista.remove(k);
		}

	}

	@Override
	public Kurs vratiKurs(String naziv) {
		for (int i = 0; i < kursnaLista.size(); i++) {
			if (kursnaLista.get(i).getNaziv().equals(naziv)) {
				return kursnaLista.get(i);
			}
		}
		return null;
	}

	@Override
	public LinkedList<Kurs> vratiKursnuListu() {
		return kursnaLista;
	}

}
