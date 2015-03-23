package valute;

import java.util.LinkedList;

public class Valuta {
	
	private String naziv,skraceniNaziv;
	private LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
	
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
	

}
