package valute;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	public void dodajKurs(String nazivValute, Kurs kurs) {
		
		if(nazivValute != null && kurs != null) {
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(nazivValute)) {
				valute.get(i).dodajKurs(kurs);
				break;
			}
		}
		} else throw new NullPointerException("Morate uneti naziv valute i kurs.");
		
	}

	public void obrisiKurs(String nazivValute, GregorianCalendar datum) {
		
		if(nazivValute != null && datum != null) {
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(nazivValute)) {
				valute.get(i).obrisiKurs(datum);
			}
		}
		} else throw new NullPointerException("Morate uneti naziv valute i datum.");
		
	}

	public Kurs pronadjiKurs(String nazivValute, GregorianCalendar datum) {
		
		if(nazivValute != null && datum != null) {
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(nazivValute)) 
				return valute.get(i).pronadjiKurs(datum);
		}
		} else throw new NullPointerException("Morate uneti naziv valute i datum.");
		return null;
	}
	
}
