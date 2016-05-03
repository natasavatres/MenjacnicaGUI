package menjacnica.gui;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.io.File;
import java.util.LinkedList;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import menjacnica.Kurs;
import menjacnica.Menjacnica;

public class GUIKontroler {

	private static Menjacnica menjacnica = new Menjacnica();
	private static Kurs kurs = new Kurs();
	private static MenjacnicaGUI m = new MenjacnicaGUI();
	private static DodajKursGUI d = new DodajKursGUI();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static String menuOpen() {
		JFileChooser fileChooser = new JFileChooser();
		int returnValue = fileChooser.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = fileChooser.getSelectedFile();
			return " Ucitan fajl: " + selectedFile.getName() + " sa lokacije " + selectedFile.getAbsolutePath() + "\n";
		}
		return "";
	}

	public static String menuSave() {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showSaveDialog(m);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File selectedFile = fc.getSelectedFile();
			return "Sacuvan fajl: " + selectedFile.getAbsolutePath();
		}
		return "";
	}

	public static void izlaz() {
		int opcija = JOptionPane.showConfirmDialog(m.getContentPane(), "Da li zelite da izadjete iz programa?",
				"Izlazak", JOptionPane.YES_NO_OPTION);

		if (opcija == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	public static void about() {

		JDialog ab = new JDialog(m);
		ab.setTitle("O autoru programa");
		ab.setSize(new Dimension(300, 100));
		ab.setLocationRelativeTo(m);
		ab.setModal(true);

		JLabel tekst = new JLabel("Natasa Vatres 10/14");
		ab.getContentPane().add(tekst);

		ab.setVisible(true);
	}

	public static void pokreniDodajKursProzor() {
		DodajKursGUI d = new DodajKursGUI();
		d.setVisible(true);
		d.setLocationRelativeTo(null);
	}

	public static void formirajNoviKurs(int sifra, String naziv, String skraceniNaziv, double prodajniKurs,
			double srednjiKurs, double kupovniKurs) {
		kurs.setSifra(sifra);
		kurs.setNaziv(naziv);
		kurs.setSkraceniNaziv(skraceniNaziv);
		kurs.setProdajniKurs(prodajniKurs);
		kurs.setSrednjiKurs(prodajniKurs, kupovniKurs);
		kurs.setKupovniKurs(kupovniKurs);

		menjacnica.dodajKurs(kurs);
		m.osveziTabelu();

	}

	public static LinkedList<Kurs> vratiListuKurseva() {
		return menjacnica.vratiListuKurseva();
	}

	public static void upozoriDaBiraRed() {
		JOptionPane.showMessageDialog(m.getContentPane(), "Izaberite kurs koji zelite da izbrisete iz tabele", "Greska",
				JOptionPane.ERROR_MESSAGE);
	}

	public static void izbrisiKurs(Kurs k) {
		menjacnica.izbrisiKurs(k);
		m.osveziTabelu();
	}
	
	public static void pokreniIzvrsiZamenuProzor(){
		IzvrsiZamenuGUI iz = new IzvrsiZamenuGUI();
		iz.setVisible(true);
		iz.setLocationRelativeTo(null);
	}

}
