package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {

    private final ArrayList<Artikl> artikli;

    public Korpa() {
        artikli = new ArrayList<Artikl>();
    }

    public Artikl[] getArtikli() {
        return artikli.toArray(new Artikl[0]);
    }

    public int velicina() {
        return artikli.size();
    } //naknadno dodana za potrebe testova

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(Artikl a: artikli) {
            if(a.getKod().equals(kod)) {
                artikli.remove(a);
                return a;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for (Artikl a : artikli) suma = suma + a.getCijena();
        return suma;
    }


    public boolean dodajArtikl(Artikl a) {
        if (artikli.size() < 50) {
            artikli.add(a);
            return true;
        }
        return false;
    }
}
