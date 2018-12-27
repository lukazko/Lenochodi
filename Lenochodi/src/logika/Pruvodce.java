/**
 *  Třída Průvodce - slouží ke správě průvodců, potomek Osoby.
 *
 *
 *@author     Lukáš Kubík
 *@version    1.0
 *@created    ZS 2018/2019
 */

package logika;

import java.util.Collection;

public class Pruvodce extends Osoba {

	private String jazyk;
	private Collection<Vychazka> vychazky;
        
        public Pruvodce (String id, String jmeno, String prijmeni, String email, String telefon, String jazyk) {
            super(id, jmeno, prijmeni, email, telefon);
            this.jazyk = jazyk;
        }
        
        
        public void setJazyk(String jazyk) {
		this.jazyk = jazyk;
	}
        
        public String getJazyk() {
		return jazyk;
	}

	public Collection getVychazky() {
		return vychazky;
	}

}
