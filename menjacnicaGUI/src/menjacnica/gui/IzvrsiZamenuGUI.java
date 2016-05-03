package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IzvrsiZamenuGUI extends JFrame {

	MenjacnicaGUI m = new MenjacnicaGUI();
	
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblProdajniKurs;
	private JLabel lblIznos;
	private JLabel lblVrstaTransakcije;
	private JTextField jtfKupovniKurs;
	private JTextField jtfProdajniKurs;
	private JComboBox comboBox;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private JTextField jtfIznos;
	private JSlider slider;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenuGUI frame = new IzvrsiZamenuGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getJtfKupovniKurs());
		contentPane.add(getJtfProdajniKurs());
		contentPane.add(getComboBox());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getJtfIznos());
		contentPane.add(getSlider());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Kupovni kurs");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel.setBounds(30, 22, 87, 19);
		}
		return lblNewLabel;
	}

	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblProdajniKurs.setBounds(284, 22, 87, 19);
		}
		return lblProdajniKurs;
	}

	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblIznos.setBounds(61, 106, 78, 19);
		}
		return lblIznos;
	}

	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblVrstaTransakcije.setBounds(267, 92, 132, 19);
		}
		return lblVrstaTransakcije;
	}

	private JTextField getJtfKupovniKurs() {
		if (jtfKupovniKurs == null) {
			jtfKupovniKurs = new JTextField();
			jtfKupovniKurs.setEditable(false);
			jtfKupovniKurs.setFont(new Font("Tahoma", Font.PLAIN, 12));
			jtfKupovniKurs.setBounds(30, 52, 115, 19);
			jtfKupovniKurs.setColumns(10);
		}
		return jtfKupovniKurs;
	}

	private JTextField getJtfProdajniKurs() {
		if (jtfProdajniKurs == null) {
			jtfProdajniKurs = new JTextField();
			jtfProdajniKurs.setEditable(false);
			jtfProdajniKurs.setFont(new Font("Tahoma", Font.PLAIN, 12));
			jtfProdajniKurs.setColumns(10);
			jtfProdajniKurs.setBounds(284, 52, 115, 19);
		}
		return jtfProdajniKurs;
	}

	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
			comboBox.setModel(new DefaultComboBoxModel(new String[] { "EUR", "USD", "CHF" }));
			comboBox.setBounds(169, 51, 87, 20);
		}
		return comboBox;
	}

	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			rdbtnKupovina.setFont(new Font("Tahoma", Font.PLAIN, 12));
			rdbtnKupovina.setBounds(273, 118, 109, 23);
		}
		return rdbtnKupovina;
	}

	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			rdbtnProdaja.setFont(new Font("Tahoma", Font.PLAIN, 12));
			rdbtnProdaja.setBounds(273, 144, 109, 23);
			groupRadioButtons();
		}
		return rdbtnProdaja;
	}

	private void groupRadioButtons() {
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnKupovina);
		group.add(rdbtnProdaja);
	}

	private JTextField getJtfIznos() {
		if (jtfIznos == null) {
			jtfIznos = new JTextField();
			jtfIznos.setFont(new Font("Tahoma", Font.PLAIN, 12));
			jtfIznos.setColumns(10);
			jtfIznos.setBounds(61, 126, 170, 19);
		}
		return jtfIznos;
	}

	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					int sliderValue = slider.getValue();
					String sliderString = String.valueOf(sliderValue);
					jtfIznos.setText(sliderString);
				}
			});
			slider.setBounds(48, 178, 323, 39);
			slider.setPaintLabels(true);
			slider.setMinorTickSpacing(5);
			slider.setMajorTickSpacing(10);
		}
		return slider;
	}

	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String transakcija;
					if (rdbtnKupovina.isSelected())
						transakcija = rdbtnKupovina.getText();
					else
						transakcija = rdbtnProdaja.getText();

					String s = " Valuta: " + comboBox.getSelectedItem() + ", iznos: " + jtfIznos.getText()
							+ ", vrsta transakcije: " + transakcija + "\n";
					m.ispisiIzvrsenuZamenu(s);

					dispose();

				}
			});
			btnIzvrsiZamenu.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btnIzvrsiZamenu.setBounds(30, 240, 111, 30);
		}
		return btnIzvrsiZamenu;
	}

	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btnOdustani.setBounds(288, 240, 111, 30);
		}
		return btnOdustani;
	}
}
