package menjacnica;

import java.util.LinkedList;

public interface MenjacnicaInterfejs {
	public void dodajKurs(Kurs k);
	public void izbrisiKurs(Kurs k);
	public Kurs vratiKurs(String naziv);
	public LinkedList<Kurs> vratiListuKurseva();
}
