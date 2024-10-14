//package si.um.feri.osebe.vao;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//public class OsebaTest {
//
//    @Test
//    public void testDatumaPredDanasnjimDnem() {
//        Oseba o=new Oseba("Michael","Jackson", LocalDate.of(2002,7,7));
//        Assertions.assertEquals(22,o.getStarost());
//    }
//
//    @Test
//    public void testDatumaPoDanasnjimDnevom() {
//        Oseba o=new Oseba("Michael","Jackson", LocalDate.of(2000,12,25));
//        Assertions.assertEquals(23,o.getStarost());
//    }
//
//    @Test
//    public void testDatuma3() {
//        Oseba o=new Oseba("Michael","Jackson", LocalDate.of(2000,2,30));
//        Assertions.assertEquals(24,o.getStarost());
//    }
//
//    @Test
//    public void testDatuma4() {
//        Oseba o=new Oseba("Michael","Jackson", LocalDate.of(2004,2,29));
//        Assertions.assertEquals(20,o.getStarost());
//    }
//
//    @Test
//    public void testDatuma7() {
//        Oseba o=new Oseba("Michael","Jackson", LocalDate.of(2004,10,14));
//        Assertions.assertEquals(20,o.getStarost());
//    }
//
//    @Test
//    public void testDatuma5() {
//        Oseba o=new Oseba("Michael","Jackson", null);
//        Assertions.assertEquals(20,o.getStarost());
//    }
//
//
//}
