package it.leo.junit.test;

import it.leo.junit.model.Potenza;
import junit.framework.TestCase;

public class TestPotenza extends TestCase {
    public void testPotenza() {
        assertEquals(0, Potenza.calcPotenza(0,1));

    }
}
/*
possiamo fare tutti i test unitari per un singolo metodo in questa classe
 */