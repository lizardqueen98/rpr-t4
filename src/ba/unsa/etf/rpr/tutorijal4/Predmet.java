package ba.unsa.etf.rpr.tutorijal4;

public class Predmet {
    private String naziv;
    private int sifra,ects_bodovi;
    private boolean izborni;
    public Predmet(String naziv, int sifra, int ects_bodovi, boolean izborni){
        this.naziv=naziv;
        this.sifra=sifra;
        this.ects_bodovi=ects_bodovi;
        this.izborni=izborni;
    }

    public int getSifra() {
        return sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getEcts_bodovi() {
        return ects_bodovi;
    }
    public void getSpisakStudenata(){

    }
    public boolean daLiJeIzborni(){
        return izborni;
    }
}
