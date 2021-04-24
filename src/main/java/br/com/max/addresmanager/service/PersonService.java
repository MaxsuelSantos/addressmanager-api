package br.com.max.addresmanager.service;

import br.com.max.addresmanager.dto.PersonDTO;
import br.com.max.addresmanager.entity.Person;
import br.com.max.addresmanager.repository.PersonRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public PersonDTO createPerson(PersonDTO personDTO) {
        Person person = personDTO.toModel();
        Person savedPerson = personRepository.save(person);

        return new PersonDTO(savedPerson);
    }

    public Person findById(Long id) {
        return personRepository.findById(id).get();
    }
}
