package br.com.max.addresmanager.controller;

import br.com.max.addresmanager.dto.PersonDTO;
import br.com.max.addresmanager.entity.Person;
import br.com.max.addresmanager.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @PostMapping
    public ResponseEntity<PersonDTO> createPerson(@RequestBody PersonDTO personDTO, UriComponentsBuilder uriBuilder) {
        PersonDTO dto = personService.createPerson(personDTO);

        URI uri = uriBuilder.path("/person/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }
}
