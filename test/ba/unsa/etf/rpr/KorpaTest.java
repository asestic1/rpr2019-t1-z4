package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KorpaTest {

    //smisljanje testova:
    //1. test koji ce samo provjeriti da li je stanje korpe okej nakon sto se doda par artikala
    //2. test koji ce provjeriti da li se dodavanje u korpu odbija nakon sto se doda 50 artikala
    //3. test za izbacivanje artikla s kodom koji postoji
    //4. test za izbacivanje artikla s kodom koji ne postoji u korpi
    //5. ukupna cijena artikala u korpi za korpu u kojoj ima nekoliko artikala
    //6. ukupna cijena artikala u korpi za korpu u kojoj nema nijednog artikla
    //7. metodu za dodavanje, kao i metode klase Supermarket, onda ne treba testirati
    //u Supermarket klasi onda samo terba istestirati ono da mu velicina ne smije preci 1000 artikala
    //treba se promijeniti klasa Korpa tako da ako dva objekta imaju isti kod, ne doyvoljava se dodavanje

    @Test
    void testKonstruktoraIDodavanja() {
        Korpa proba = new Korpa();
        for(int i = 0; i < 3; i++) {
            proba.dodajArtikl(new Artikl("Mobitel", 500, i));
        }
        assertEquals(3, proba.velicina());
    }

    @Test
    void viseOdMaksimumaArtikala() {
        Korpa proba = new Korpa();
        for(int i = 0; i < 60; i++) {
            proba.dodajArtikl(new Artikl("Mobitel", 500, i));
        }
        assertEquals(50, proba.velicina());
    }

    @Test
    void izbaciArtikl() {
        Korpa proba = new Korpa();
        for(int i = 0; i < 3; i++) {
            proba.dodajArtikl(new Artikl("Mobitel", 500, i));
        }
        proba.izbaciArtiklSaKodom(String.valueOf(1)); //prvo izbaci artikl s kodom 1
        assertEquals(2, proba.velicina()); //pa provjerava da li ga ima u kolekciji
        proba.izbaciArtiklSaKodom(String.valueOf(14)); //direktno izbacuje artikl s nepostojecim kodom
        assertEquals(2, proba.velicina()); //ali velicina niza ostaje ista, tako da nista nije izbaceno
    }


    @Test
    void cijenaArtikalaUKorpi() {
        Korpa proba = new Korpa();
        assertEquals(0, proba.dajUkupnuCijenuArtikala());
        for(int i = 0; i < 3; i++) {
            proba.dodajArtikl(new Artikl("Mobitel", 500, i));
        }
        assertEquals(1500, proba.dajUkupnuCijenuArtikala());
    }


}