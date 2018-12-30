/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import logika.Vychazka;
import org.junit.Before;
import org.junit.Test;
import logika.Pruvodce;
import org.junit.Assert;

/**
 *
 * @author Marko
 */

public class TestPruvodce {
    private Vychazka vychazka;
     /**
     * Metoda pro vytvoření podkladů pro testování
     *     
     */
            
    @Before
    public void setUp() {
        vychazka = new Vychazka(1,"a","b","c","d","e",15,2500,"f");
    }
    
    
        /**
     * Metoda pro testování zda pruvodce existuje a ma přiřazený správny jazyk
     *
     *     
     */
    @Test
        public void existujePruvodce() {
        Pruvodce testovaci = new Pruvodce(3,"ab","de","kl","asd","aj");
        testovaci.getJazyk();
        Assert.assertEquals("aj",testovaci.getJazyk());
        }
}
