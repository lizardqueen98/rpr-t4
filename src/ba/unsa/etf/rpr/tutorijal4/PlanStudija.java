package ba.unsa.etf.rpr.tutorijal4;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PlanStudija {
    private Map<Integer, Set<Predmet>> m;
    public PlanStudija(){
        m = new HashMap<Integer, Set<Predmet>>();
    }
    public void dodajSemestar(int i, Set<Predmet> s){
        m.put(i,s);
    }
    public void dodajPredmetUSemestar(int i,Predmet p){
        for(HashMap.Entry<Integer,Set<Predmet>> entry : m.entrySet()){
            if(entry.getKey()==i) entry.getValue().add(p);
        }
    }
}
