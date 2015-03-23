package valute;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	public void dodajKurs(String nazivValute, Kurs kurs) {
		
	}

	public void obrisiKurs(String nazivValute, GregorianCalendar datum) {
		
	}

	public Kurs pronadjiKurs(String nazivKursa, GregorianCalendar datum) {
		return null;
	}
	
	

}
