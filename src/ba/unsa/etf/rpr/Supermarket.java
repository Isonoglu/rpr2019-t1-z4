package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    private static int brojacArtikala = 0;
    //private ArrayList<Artikl> artikli = new ArrayList<Artikl>();
    private Artikl[] artikli = new Artikl[1000];

    public void dodajArtikl(Artikl noviArtikl) {
        artikli[brojacArtikala] = noviArtikl;

        artikli[brojacArtikala] = new Artikl(noviArtikl.getNaziv(), noviArtikl.getCijena(), noviArtikl.getKod());
        brojacArtikala = brojacArtikala + 1;
    }
    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl povratakMetode = null;
        for(int i = 0; i < brojacArtikala; i++) {
            if(artikli[i].getKod().equals(kod)){
                povratakMetode = artikli[i];
                for(int j = i; j < brojacArtikala - 1; j++) {
                    artikli[j] = artikli[j + 1];
                }
            }
        }
        artikli[brojacArtikala - 1] = null;
        brojacArtikala = brojacArtikala - 1;
        return povratakMetode;
    }
}
