package ba.unsa.etf.rpr.tutorijal4;

import java.util.Set;
import java.util.TreeSet;

public class Fakultet {
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
        upisani.add(new Upis(s,p,ps));
    }
}
