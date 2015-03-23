package interfejs;

import java.util.GregorianCalendar;

import valute.Kurs;

public interface MenjacnicaInterfejs {
	
	public void dodajKurs(String nazivValute, Kurs kurs);
	public void obrisiKurs(String nazivValute, GregorianCalendar datum);
	public Kurs pronadjiKurs(String nazivKursa, GregorianCalendar datum);

}
