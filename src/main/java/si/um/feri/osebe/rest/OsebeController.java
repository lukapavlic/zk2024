package si.um.feri.osebe.rest;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import si.um.feri.osebe.dao.OsebaRepository;
import si.um.feri.osebe.vao.Oseba;
import java.util.Optional;
import java.util.logging.Logger;

@CrossOrigin
@RestController
public class OsebeController {

    Logger logger = Logger.getLogger(OsebeController.class.getName());

    @Autowired
    OsebaRepository repository;

    @GetMapping("/info")
    public String info(){
        return "Hello World!";
    }

    @GetMapping("/osebe")
    public Iterable<Oseba> getAllOseba(){
        logger.info("Getting all Oseba data");
        return repository.findAll();
    }

    @GetMapping("/osebe/{id}")
    public Optional<Oseba> getOsebaById(@PathParam("id") int id){
        logger.info("Get Oseba by id: " + id);
        return repository.findById(id);
    }

    @PutMapping("/osebe")
    public void putOseba(Oseba oseba){
        logger.info("Put Oseba with id: " + oseba.getId());
        repository.save(oseba);
    }

    @PostMapping("/osebe")
    public Oseba postOseba(Oseba oseba){
        logger.info("Post Oseba " + oseba);
        Oseba newOseba = new Oseba(oseba.getIme(), oseba.getPriimek());
        repository.save(newOseba);
        return newOseba;
    }

}
