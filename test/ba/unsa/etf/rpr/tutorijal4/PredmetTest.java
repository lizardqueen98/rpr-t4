package ba.unsa.etf.rpr.tutorijal4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void getSifra() {
        Predmet p =new Predmet("matematika",1,10,false);
        assertEquals(1,p.getSifra());
    }

    @Test
    void getNaziv() {
        Predmet p =new Predmet("matematika",1,10,false);
        assertEquals("matematika",p.getNaziv());
    }

    @Test
    void getEctsBodovi() {
        Predmet p =new Predmet("matematika",1,10,false);
        assertEquals(10,p.getEctsBodovi());
    }

    @Test
    void daLiJeIzborni() {
        Predmet p =new Predmet("matematika",1,10,false);
        assertEquals(false ,p.daLiJeIzborni());
    }
}