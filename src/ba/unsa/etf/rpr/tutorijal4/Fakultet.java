package ba.unsa.etf.rpr.tutorijal4;

import java.util.Set;
import java.util.TreeSet;

public class Fakultet {
    //moramo napraviti compareTo metode da bismo ubacivali u treeset
    private Set<Student> studenti;
    private Set<Predmet> predmeti;
    private Set<Upis> upisani;
    public Fakultet(){
        studenti=new TreeSet<>();
        predmeti=new TreeSet<>();
        upisani=new TreeSet<>();
    }
    public void dodajStudenta(Student s){
        studenti.add(s);
    }
    public void dodajPredmet(Predmet p){
        predmeti.add(p);
    }
    public void upisi(Student s, Predmet p, PlanStudija ps){
        for(Student student : studenti) if(student.equals(s)){
            for(Predmet predmet : predmeti) if(predmet.equals(p)) upisani.add(new Upis(student,predmet,ps));
        };
    }
    public void getSpisakStudenata(Predmet p){
        for(Upis u : upisani){
            if(u.getP().equals(p)) System.out.println(u.getS().getIme());
        }
    }
    public int getEctsBodoveStudenta(Student s){
        int ectsBodovi=0;
        for(Upis u : upisani){
            if(u.getS().equals(s)) ectsBodovi+=u.getP().getEctsBodovi();
        }
        return ectsBodovi;
    }
}
