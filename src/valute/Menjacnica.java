package valute;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	public void dodajKurs(String nazivValute, Kurs kurs) {
		
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(nazivValute)) {
				valute.get(i).dodajKurs(kurs);
				break;
			}
		}
		
	}

	public void obrisiKurs(String nazivValute, GregorianCalendar datum) {
		
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(nazivValute)) {
				valute.get(i).obrisiKurs(datum);
			}
		}
		
	}

	public Kurs pronadjiKurs(String nazivValute, GregorianCalendar datum) {
		
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(nazivValute)) 
				return valute.get(i).pronadjiKurs(datum);
		}
		return null;
	}
	
	

}
