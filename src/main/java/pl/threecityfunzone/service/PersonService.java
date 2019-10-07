package pl.threecityfunzone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.threecityfunzone.model.Person;
import pl.threecityfunzone.repository.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void savePerson(Person person){
        personRepository.save(person);
    }

}
