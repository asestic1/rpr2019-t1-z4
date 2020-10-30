package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {

    private ArrayList<Artikl> artikli;

    public Korpa() {
        artikli = new ArrayList<Artikl>();
    }

    public Artikl[] getArtikli() {
        return (Artikl[]) artikli.toArray(new Artikl[artikli.size()]);
    }

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
