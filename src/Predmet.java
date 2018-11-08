public class Predmet {
    private String naziv;
    private int sifra,ects_bodovi;
    private Student[] studenti;
    private boolean izborni;
    private int broj_upisanih;
    public Predmet(String naziv,int sifra, int ects_bodovi, boolean izborni){
        broj_upisanih=0;
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
    public void upisiStudenta(Student s){

    }
    public boolean daLiJeUpisan(Student s){
        return true;
    }
    public void ispisiStudenta(Student s){

    }
}
