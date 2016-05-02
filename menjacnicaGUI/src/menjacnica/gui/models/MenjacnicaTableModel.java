package menjacnica.gui.models;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import menjacnica.Kurs;

public class MenjacnicaTableModel extends AbstractTableModel {

	private final String[] kolone = new String[] { "Sifra", "Skraceni naziv", "Prodajni", "Srednji", "Kupovni",
			"Naziv" };
	private List<Kurs> kursevi;

	public MenjacnicaTableModel(List<Kurs> kursevi) {
		this.kursevi = kursevi;
	}

	@Override
	public int getColumnCount() {
		return kolone.length;
	}

	@Override
	public int getRowCount() {
		return kursevi.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Kurs k = kursevi.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return k.getSifra();
		case 1:
			return k.getSkraceniNaziv();
		case 2:
			return k.getProdajniKurs();
		case 3:
			return k.getSrednjiKurs();
		case 4:
			return k.getKupovniKurs();
		case 5:
			return k.getNaziv();
		default:
			return "NN";
		}
	}

	@Override
	public String getColumnName(int column) {
		return kolone[column];
	}

	public void staviSveKurseveUModel(List<Kurs> kursevi) {
		this.kursevi = kursevi;
		fireTableDataChanged();
	}

	public Kurs vratiKursPoIndexu(int index) {
		return kursevi.get(index);
	}

}
