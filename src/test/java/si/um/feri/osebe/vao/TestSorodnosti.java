package si.um.feri.osebe.vao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSorodnosti {

    @Test
    public void testSorodnosti() {
        Oseba o1=new Oseba("Prvi","Novak");
        Oseba o2=new Oseba("Drugo","NOVAK");
        Assertions.assertTrue(o1.staVSorodu(o2));
    }

    @Test
    public void testSorodnosti2() {
        Oseba o1=new Oseba("Prvi","Holbl");
        Oseba o2=new Oseba("Drugo","Hölbl");
        Assertions.assertTrue(o1.staVSorodu(o2));
    }
    @Test
    public void testSorodnosti3() {
        Oseba o1=new Oseba("Prvi","Pavlic");
        Oseba o2=new Oseba("Drugo","PAVLIČ");
        Assertions.assertTrue(o1.staVSorodu(o2));
    }



}
