package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    private ArrayList<Artikl> artikli;

    Supermarket() {
        artikli = new ArrayList<Artikl>();
    }

    public Artikl[] getArtikli() {
        return artikli.toArray(new Artikl[artikli.size()]); //remember this
    }

    private boolean postojiArtiklSaKodom(String kod) {
        for(Artikl a: artikli) {
            if(a.getKod().equals(kod)) return true;
        }
        return false;
    }

    public int velicina() {
        return artikli.size();
    }

    public boolean dodajArtikl(Artikl a) {
        if(artikli.size() < 1000 && !postojiArtiklSaKodom(a.getKod())) {
            artikli.add(a);
            return true;
        }
        return false;

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
}
