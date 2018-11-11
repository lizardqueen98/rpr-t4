package ba.unsa.etf.rpr.tutorijal4;

public class Predmet implements Comparable<Predmet>{
    private String naziv;
    private int sifra,ects_bodovi;
    private boolean izborni;
    public Predmet(String naziv, int sifra, int ects_bodovi, boolean izborni){
        this.naziv=naziv;
        this.sifra=sifra;
        this.ects_bodovi=ects_bodovi;
        this.izborni=izborni;
    }
    @Override
    public int compareTo(Predmet p){
        if(this.sifra>p.sifra) return 1;
        if(this.sifra<p.sifra) return -1;
        return 0;
    }
    @Override
    public boolean equals(Object o){
        Predmet predmet = (Predmet) o;
        return naziv.equals(predmet.naziv) && sifra==predmet.sifra && ects_bodovi==ects_bodovi;
    }

    public int getSifra() {
        return sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getEctsBodovi() {
        return ects_bodovi;
    }

    public boolean daLiJeIzborni(){
        return izborni;
    }
}
