package ba.unsa.etf.rpr;

public class Korpa {
    private static int brojacArtikala = 0;
    //private ArrayList<Artikl> artikli = new ArrayList<Artikl>();
    private Artikl[] artikli = new Artikl[50];

    public boolean dodajArtikl(Artikl noviArtikl) {
        if(brojacArtikala > 50)
            return false;

        artikli[brojacArtikala] = new Artikl(noviArtikl.getNaziv(), noviArtikl.getCijena(), noviArtikl.getKod());
        brojacArtikala = brojacArtikala + 1;
        return true;
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


    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijanaArtikala = 0;
        for (int i = 0; i < brojacArtikala; i++) {
            ukupnaCijanaArtikala = ukupnaCijanaArtikala + artikli[i].getCijena();
        }
        return ukupnaCijanaArtikala;
    }
}
