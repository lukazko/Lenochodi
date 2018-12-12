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
import java.util.HashSet;

public class Pruvodce extends Osoba {

	private HashSet jazyky;
	private Collection<Vychazka> vychazky;
        
        public Pruvodce (int id, String jmeno, String prijmeni, String email, String telefon) {
            super(id, jmeno, prijmeni, email, telefon);
            jazyky = new HashSet<>();
        }
        
        public void pridejJazyk(String jazyk) {
            jazyky.add(jazyk);
        }
        
        public void odeberJazyk(String jazyk) {
            jazyky.remove(jazyk);
        }
        
	public boolean najdiJazyk(String jazyk) {
            return jazyky.contains(jazyk);
	}

	public Collection getVychazky() {
		return vychazky;
	}

}
