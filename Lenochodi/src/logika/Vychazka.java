package logika;

import java.util.Date;
import java.util.Collection;

public class Vychazka {

	private int id;
	private String nazev;
	private Date datum;
	private Date casZacatek;
	private String mistoZacatek;
	private String jazyk;
	private int kapacita;
	private Float cena;
	private Pruvodce pruvodce;
	private Collection<Objednavka> seznamObjednavek;

        public Vychazka (int id, String nazev, Date datum, Date casZacatek, String mistoZacatek, String jazyk, int kapacita, float cena, Pruvodce pruvodce) {
            this.id = id;
            this.nazev = nazev;
            this.datum = datum;
            this.casZacatek = casZacatek;
            this.mistoZacatek = mistoZacatek;
            this.jazyk = jazyk;
            this.kapacita = kapacita;
            this.cena = cena;
            this.pruvodce = pruvodce;
        }
        
        public void setId(int id) {
		this.id = id;
	}
        
        public int getId() {
		return id;
	}
        
	public void setPruvodce(Pruvodce pruvodce) {
            if (pruvodce.getJazyk() == jazyk)
                {
		this.pruvodce = pruvodce;
	}}
        
        public Pruvodce getPruvodce() {
		return pruvodce;
	}
        
        public void setNazev(String nazev) {
		this.nazev = nazev;
	}
        
        public String getNazev() {
		return nazev;
	}
        
        public void setDatum(Date datum) {
		this.datum = datum;
	}
        
        public Date getDatum() {
		return datum;
	}
        
        public void setCasZacatek(Date casZacatek) {
		this.casZacatek = casZacatek;
	}
        
        public Date getCasZacatek() {
		return casZacatek;
	}
        
        public void setMistoZacatek(String mistoZacatek) {
		this.mistoZacatek = mistoZacatek;
	}
        
        public String getMistoZacatek() {
		return mistoZacatek;
	}
        
        public void setJazyk(String jazyk) {
		this.jazyk = jazyk;
	}
        
        public String getJazyk() {
		return jazyk;
	}
        
        public void setCena(float cena) {
		this.cena = cena;
	}
        
        public Float getCena() {
		return cena;
	}
	
        public void setKapacita(int kapacita) {
		this.kapacita = kapacita;
	}
        
        public int getKapacita() {
		return kapacita;
	}
              
        public int getZbyvajiciKapacita() {
            int pocetObjednavek = seznamObjednavek.size();
            int zbyvajiciKapacita = kapacita - pocetObjednavek;
            
            return zbyvajiciKapacita;
	}

	public Collection<Objednavka> getSeznamObjednavek() {
		return seznamObjednavek;
	}

}
