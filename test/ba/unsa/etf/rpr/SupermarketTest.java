package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket proba = new Supermarket();
        for(int i = 0; i < 1005; i++) {
            proba.dodajArtikl(new Artikl("Mobitel", 500, i));
        }
        assertEquals(1000, proba.velicina());

    }
}