/**
 *  Třída Průvodce - slouží ke správě průvodců, potomek Osoby.
 *
 *
 *@author     Lukáš Kubík
 *@version    1.0
 *@created    ZS 2018/2019
 */

package logika;

import java.util.HashMap;
import java.util.Collection;

public class Pruvodce extends Osoba {

	private HashMap jazyky;
	private Collection<Vychazka> vychazky;
        
        public Pruvodce (int id, String jmeno, String prijmeni, String email, String telefon) {
            super(id, jmeno, prijmeni, email, telefon);
            jazyky = new HashMap<>();
        }
        
        public void pridejJazyk(String jazyk) {

        }
        
        public void odeberJazyk(String jazyk) {
            jazyky.remove(jazyk);
        }
        
	public boolean najdiJazyk(String jazyk) {
            return jazyky.containsKey(jazyk);
	}

	public Collection getVychazky() {
		return vychazky;
	}

}
