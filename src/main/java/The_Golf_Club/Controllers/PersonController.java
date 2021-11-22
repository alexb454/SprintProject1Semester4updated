/*package The_Golf_Club.Controllers;


import The_Golf_Club.Java.*;
import The_Golf_Club.Repository.Person;
import The_Golf_Club.Repository.Person;
import The_Golf_Club.Repository.Person;
import The_Golf_Club.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3306")
@RestController
@RequestMapping("/api")
public class PersonController {
    @Autowired
    PersonRepository repo;

    @GetMapping("/people")
    public ResponseEntity<List<Person>> getAllByName(@RequestParam(required = false) String name) {
        try{
            List<Person> persons = new ArrayList<Person>();
            if(name == null)
                repo.findByName(name).forEach(persons::add);
            return new ResponseEntity<>(persons, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/people")
    public ResponseEntity<List<Person>> getAllByAddress(@RequestParam(required = false) String address) {
        try{
            List<Person> persons = new ArrayList<Person>();
            if(address == null)
                repo.findByAddress(address).forEach(persons::add);
            return new ResponseEntity<>(persons, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/people")
    public ResponseEntity<List<Person>> getAllByEmail(@RequestParam(required = false) String email) {
        try{
            List<Person> persons = new ArrayList<Person>();
            if(email == null)
                repo.findByEmail(email).forEach(persons::add);
            return new ResponseEntity<>(persons, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/people")
    public ResponseEntity<List<Person>> getAllMembershipsByPhoneNumber(@RequestParam(required = false) int phoneNumber) {
        try{
            List<Person> persons = new ArrayList<Person>();
            if(phoneNumber == 0)
                repo.findByPhoneNumber(phoneNumber).forEach(persons::add);
            return new ResponseEntity<>(persons, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/people")
    public ResponseEntity<Person> postPerson(@RequestBody Person person) {
        try {
            Person person1 = (Person) repo
                    .save(new Person(person.getName(), person.getAddress(), person.getEmail(), person.getPhoneNumber()));
            return new ResponseEntity<>(person1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/people/{id}")
    public ResponseEntity<Person> updatedPerson(@PathVariable("id") long id, @RequestBody Person person ) {
        Optional<Person> personInfo = repo.findById(id);
        if (personInfo.isPresent()) {
            Person membership1 = personInfo.get();
            membership1.setName(person.getName());
            membership1.setAddress(person.getAddress());
            membership1.setEmail(person.getEmail());
            membership1.setPhoneNumber(person.getPhoneNumber());
            return new ResponseEntity<>(repo.save(membership1), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/people/{id}")
    public ResponseEntity<Person> deletedPerson(@PathVariable("id") long id){
        try{
            repo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}*/
