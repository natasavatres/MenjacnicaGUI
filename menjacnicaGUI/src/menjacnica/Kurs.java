package menjacnica;

public class Kurs {

	private int sifra;
	private String naziv;
	private String skraceniNaziv;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}

	public double getProdajniKurs() {
		return prodajniKurs;
	}

	public void setProdajniKurs(double prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}

	public double getKupovniKurs() {
		return kupovniKurs;
	}

	public void setKupovniKurs(double kupovni) {
		this.kupovniKurs = kupovni;
	}

	public double getSrednjiKurs() {
		return (prodajniKurs + kupovniKurs) / 2;
	}

	public void setSrednjiKurs(double prodajniKurs, double kupovniKurs) {
		this.srednjiKurs = (prodajniKurs + kupovniKurs) / 2;
	}

	@Override
	public String toString() {
		return "Sifra: " + sifra + " Naziv: " + naziv + " Skraceni naziv: "
				+ skraceniNaziv + " Prodajni kurs: " + prodajniKurs + " Srednji kurs: "
				+ srednjiKurs + " Kupovni kurs: " + kupovniKurs + "\n";
	}

}
