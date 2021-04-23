package sports.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import sports.beans.Person;
import sports.dao.PessangerDao;
import sports.flight.Flyer;
import sports.flight.FlyerImp;

import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ItemController {
    @Autowired
    private Flyer flyer;
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Flyer flyer(){
        return new FlyerImp();
    }
    @Autowired
    private PessangerDao pessangerDao;

    List<Person> personList = Arrays.asList(new Person("Imtiaz", "Karachi"),
            new Person("Asim", "Lahore"));

    @RequestMapping(produces = "application/json", value = "/test")
    public String hello() {
        flyer.fly();
       pessangerDao.getPessenger(20);
        return "Hello i am server";

    }


    @GetMapping("/")
    public String welcome(){
        return "Welcome to Sports Service";
    }


    @RequestMapping(produces = "application/json", value = "/sports/{name}")
    public Person start(@PathVariable final String name) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }


        return personList.stream().filter(person -> person.getName().equalsIgnoreCase(name)).findAny().orElse(null);
    }
}
