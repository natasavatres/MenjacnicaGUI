package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import menjacnica.Kurs;
import menjacnica.Menjacnica;

import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.peer.TextFieldPeer;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {
	
	private static Menjacnica menjacnica = new Menjacnica();
	private static Kurs kurs = new Kurs();

	private JPanel contentPane;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField textFieldSifra;
	private JTextField textFieldNaziv;
	private JTextField textFieldKursP;
	private JTextField textFieldKursK;
	private JTextField textFieldKursS;
	private JTextField textFieldNazivS;
	private JButton btnDodaj;
	private JButton btnOdustani;

	/**
	 * Create the frame.
	 */
	public DodajKursGUI() {
		setResizable(false);
		setPreferredSize(new Dimension(600, 600));
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 286);
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(600, 600));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getTextFieldSifra());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getTextFieldKursP());
		contentPane.add(getTextFieldKursK());
		contentPane.add(getTextFieldKursS());
		contentPane.add(getTextFieldNazivS());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
	}
	
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblSifra.setBounds(31, 11, 60, 17);
		}
		return lblSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNaziv.setBounds(227, 11, 60, 17);
		}
		return lblNaziv;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblProdajniKurs.setBounds(31, 72, 119, 17);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblKupovniKurs.setBounds(227, 72, 109, 17);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblSrednjiKurs.setBounds(31, 133, 95, 17);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblSkraceniNaziv.setBounds(227, 133, 109, 17);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setFont(new Font("Tahoma", Font.PLAIN, 13));
			textFieldSifra.setBounds(31, 39, 119, 22);
			textFieldSifra.setColumns(10);
		}
		return textFieldSifra;
	}
	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setFont(new Font("Tahoma", Font.PLAIN, 13));
			textFieldNaziv.setColumns(10);
			textFieldNaziv.setBounds(227, 39, 119, 22);
		}
		return textFieldNaziv;
	}
	private JTextField getTextFieldKursP() {
		if (textFieldKursP == null) {
			textFieldKursP = new JTextField();
			textFieldKursP.setFont(new Font("Tahoma", Font.PLAIN, 13));
			textFieldKursP.setColumns(10);
			textFieldKursP.setBounds(31, 100, 119, 22);
		}
		return textFieldKursP;
	}
	private JTextField getTextFieldKursK() {
		if (textFieldKursK == null) {
			textFieldKursK = new JTextField();
			textFieldKursK.setFont(new Font("Tahoma", Font.PLAIN, 13));
			textFieldKursK.setColumns(10);
			textFieldKursK.setBounds(227, 100, 119, 22);
		}
		return textFieldKursK;
	}
	private JTextField getTextFieldKursS() {
		if (textFieldKursS == null) {
			textFieldKursS = new JTextField();
			textFieldKursS.setFont(new Font("Tahoma", Font.PLAIN, 13));
			textFieldKursS.setColumns(10);
			textFieldKursS.setBounds(31, 161, 119, 22);
		}
		return textFieldKursS;
	}
	private JTextField getTextFieldNazivS() {
		if (textFieldNazivS == null) {
			textFieldNazivS = new JTextField();
			textFieldNazivS.setFont(new Font("Tahoma", Font.PLAIN, 13));
			textFieldNazivS.setColumns(10);
			textFieldNazivS.setBounds(227, 161, 119, 22);
		}
		return textFieldNazivS;
	}
	
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sifra = Integer.parseInt(textFieldSifra.getText());
					String naziv = textFieldSifra.getText();
					String skraceniNaziv = textFieldSifra.getText();
					double prodajniKurs = Double.parseDouble(textFieldKursP.getText());
					double srednjiKurs = Double.parseDouble(textFieldKursS.getText());
					double kupovniKurs = Double.parseDouble(textFieldKursK.getText());
					
					GUIKontroler.formirajNoviKurs(sifra,naziv,skraceniNaziv,prodajniKurs,srednjiKurs,kupovniKurs);
				}
			});
			btnDodaj.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnDodaj.setBounds(31, 212, 119, 34);
		}
		return btnDodaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnOdustani.setBounds(227, 212, 119, 34);
		}
		return btnOdustani;
	}
}
