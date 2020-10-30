package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    private ArrayList<Artikl> artikli;

    Supermarket() {
        artikli = new ArrayList<Artikl>();
    }

    public Artikl[] getArtikli() {
        return (Artikl[]) artikli.toArray();
    }

    public boolean dodajArtikl(Artikl a) {
        if(artikli.size() < 50) {
            artikli.add(a);
            return true;
        }
        return false;

    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl pomocni = null;
        for(Artikl a: artikli) {
            if(a.getKod().equals(kod)) {
                pomocni = a;
                artikli.remove(a);
            }
        }
        return pomocni;
    }
}
