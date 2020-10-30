package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private int cijena;
    private int kod;

    public Artikl() {
        naziv = ""; cijena = 0; kod = 0;
    }

    public Artikl(String naziv, int cijena, int kod) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod = kod;
    }

    public Artikl(String ime, int cijena, String kod) {
        this.naziv = ime;
        this.cijena = cijena;
        this.kod = Integer.parseInt(kod);
    }

    public String getNaziv() {
        return naziv;
    }


    public String getKod() {
        return Integer.toString(kod);
    }

    public int getCijena() {
        return cijena;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public void setIme(String ime) {
        this.naziv = ime;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }
}
