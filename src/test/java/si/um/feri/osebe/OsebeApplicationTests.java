package si.um.feri.osebe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import si.um.feri.osebe.dao.OsebaRepository;
import si.um.feri.osebe.rest.OsebeController;
import si.um.feri.osebe.vao.Oseba;

@SpringBootTest
class OsebeApplicationTests {

	@Autowired
	OsebaRepository osebaRepository;

	@Autowired
	OsebeController controller;
    @Autowired
    private OsebeController osebeController;

	@BeforeEach
	void init() {
		osebaRepository.deleteAll();
	}

	@Test
	void contextLoads() {
		Oseba oseba = new Oseba("Miško","Kranjec");
		osebaRepository.save(oseba);
		Assertions.assertEquals(1,osebaRepository.count());
	}

	@Test
	void restTest() {
		Assertions.assertEquals(0,osebaRepository.count());
		osebeController.postOseba(new Oseba("Ime","Priimek"));
		Assertions.assertEquals(1,osebaRepository.count());
	}

}
