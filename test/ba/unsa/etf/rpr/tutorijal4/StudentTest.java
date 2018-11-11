package ba.unsa.etf.rpr.tutorijal4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getIme() {
        Student s = new Student("Nadija","Borovina",18067);
        assertEquals("Nadija",s.getIme());
    }

    @Test
    void getPrezime() {
        Student s = new Student("Nadija","Borovina",18067);
        assertEquals("Borovina",s.getPrezime());
    }

    @Test
    void getBroj_indeksa() {
        Student s = new Student("Nadija","Borovina",18067);
        assertNotEquals(18033,s.getBroj_indeksa());
    }
}