package ba.unsa.etf.rpr;

public class Korpa {
    private static int brojacArtikala = 0;
    //private ArrayList<Artikl> artikli = new ArrayList<Artikl>();
    private Artikl[] artikli = new Artikl[50];

    public boolean dodajArtikl(Artikl noviArtikl) {
        artikli[brojacArtikala] = noviArtikl;
        brojacArtikala = brojacArtikala + 1;
        return false;
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

    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijanaArtikala = 0;
        for(Artikl x : artikli){
            ukupnaCijanaArtikala = ukupnaCijanaArtikala + x.getCijena();
        }
        return ukupnaCijanaArtikala;
    }
}
