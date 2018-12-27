/**
 *  Třída Zakazník - slouží ke správě zákazníků, potomek Osoby.
 *
 *
 *@author     Lukáš Kubík
 *@version    1.0
 *@created    ZS 2018/2019
 */

package logika;

import java.util.Collection;

public class Zakaznik extends Osoba {

	private Collection<Objednavka> objednavky;

        public Zakaznik (String id, String jmeno, String prijmeni, String email, String telefon) {
            super(id, jmeno, prijmeni, email, telefon);
        }
        
	public Collection getObjednavky() {
		return objednavky;
	}

}
