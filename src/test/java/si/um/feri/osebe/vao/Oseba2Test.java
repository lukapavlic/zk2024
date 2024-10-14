package si.um.feri.osebe.vao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class Oseba2Test {

    List<Oseba> osebas = new ArrayList<>();

    @BeforeEach
    void zacetnoStanje(){
        osebas = new ArrayList<>();
        osebas.add(new Oseba("Peter","Klepec"));
        osebas.add(new Oseba("Martin","Krpan"));
    }

    @Test
    void test2() {
        Assertions.assertEquals(2, osebas.size());
    }

    @Test
    void test3() {
        osebas.add(new Oseba("Mojca","Pokrajculja"));
        Assertions.assertEquals(3, osebas.size());
    }

    @Test
    void test4() {
        osebas.remove(new Oseba("Peter","Klepec"));
        Assertions.assertEquals(1, osebas.size());
    }





}
