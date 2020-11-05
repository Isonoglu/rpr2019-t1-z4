package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private String kod;
    private int cijena;

    public Artikl(String nazivArtikla, int cijenaArtikla, String kodArtikla) {
        this.naziv = nazivArtikla;
        this.kod = kodArtikla;
        this.cijena = cijenaArtikla;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String nazivArtikla) {
        this.naziv = nazivArtikla;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kodArtikla) {
        this.kod = kodArtikla;
    }

    public int getCijena() {
        return cijena;
    }

    public void setCijena(int cijenaArtikla) {
        this.cijena = cijenaArtikla;
    }
}
