package ba.unsa.etf.rpr.tutorijal4;

public class Upis {
    private Student s;
    private Predmet p;
    private PlanStudija ps;
    public Upis(Student s, Predmet p, PlanStudija ps){
        this.s=s;
        this.p=p;
        this.ps=ps;
    }

    public void setP(Predmet p) {
        this.p = p;
    }

    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }

    public Predmet getP() {
        return p;
    }

    public PlanStudija getPs() {
        return ps;
    }

    public void setPs(PlanStudija ps) {
        this.ps = ps;
    }
}
