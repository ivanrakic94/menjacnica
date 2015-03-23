package valute;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Valuta {
	
	private String naziv,skraceniNaziv;
	private LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv != null) this.naziv = naziv;
		else throw new NullPointerException("Morate uneti naziv");
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv != null) this.skraceniNaziv = skraceniNaziv;
		else throw new NullPointerException("Morate uneti skraceni naziv");
	}
	
	public void dodajKurs(Kurs kurs) {
		kursevi.add(kurs);
	}
	
	public void obrisiKurs(GregorianCalendar datum) {
		for (int i = 0; i < kursevi.size(); i++) {
			if(kursevi.get(i).getDatum().equals(datum)) {
				kursevi.remove(i);
				break;
			}
		}
	}
	
	public Kurs pronadjiKurs(GregorianCalendar datum) {
		for (int i = 0; i < kursevi.size(); i++) {
			if(kursevi.get(i).getDatum().equals(datum)) 
				return kursevi.get(i);
		}
		return null;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursevi == null) ? 0 : kursevi.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result
				+ ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Valute [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv
				+ ", kursevi=" + kursevi + "]";
	}

}
