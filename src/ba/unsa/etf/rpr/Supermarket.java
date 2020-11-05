package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    private static int brojacArtikala = 0;
    //private ArrayList<Artikl> artikli = new ArrayList<Artikl>();
    private Artikl[] artikli = new Artikl[100];

    public void dodajArtikl(Artikl noviArtikl) {
        artikli[brojacArtikala++] = noviArtikl;
    }


    public Artikl[] getArtikli() {

        return artikli;

    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        int indeksArtiklaKojiSeVracaIzFunkcije = 0;
        for(int i = 0; i < brojacArtikala; i++) {
            if(artikli[i].getKod().equals(kod)){
                indeksArtiklaKojiSeVracaIzFunkcije = i;
                for(int j = i; j < brojacArtikala - 1; j++) {
                    artikli[j] = artikli[j + 1];
                }
            }
        }
        return artikli[indeksArtiklaKojiSeVracaIzFunkcije];
    }
}