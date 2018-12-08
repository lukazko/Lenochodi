/**
 *  Třída Objednávka - slouží ke správě objednávek.
 *
 *
 *@author     Lukáš Kubík
 *@version    1.0
 *@created    ZS 2018/2019
 */

package logika;

public class Objednavka {

	private int id;
	private String stav;
	private Vychazka vychazka;
	private Zakaznik zakaznik;

	public Objednavka (int id, Vychazka vychazka, Zakaznik zakaznik) {
		this.id = id;
		this.vychazka = vychazka;
                this.zakaznik = zakaznik;
                stav = "nezaplaceno";
        }
        
        public void setId(int id) {
		this.id = id;
	}
        
        public int getId() {
		return id;
	}       
        
        public void setStav(String stav) {
		this.stav = stav;
	}
        
        public String getStav() {
		return stav;
	}
        
        public void setVychazka(Vychazka vychazka) {
            if (vychazka.getZbyvajiciKapacita() > 0)
            {
		this.vychazka = vychazka;
	}}
        
        public Vychazka getVychazka() {
		return vychazka;
	}

	public void setZakaznik(Zakaznik zakaznik) {
		this.zakaznik = zakaznik;
	}
        
        public Zakaznik getZakaznik() {
		return zakaznik;
	}

}
