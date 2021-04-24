package br.com.max.addresmanager.dto;

import br.com.max.addresmanager.entity.Person;


import java.time.LocalDate;

public class PersonDTO {

    private Long id;

    private String name;

    private String email;

    private String cpf;

    private LocalDate birthDate;

    public PersonDTO() {
    }

    public PersonDTO(Person person) {
        this.id = person.getId();
        this.name = person.getName();
        this.email = person.getEmail();
        this.cpf = person.getCpf();
        this.birthDate = person.getBirthDate();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Person toModel() {
        return new Person(this.name, this.email, this.cpf, this.birthDate);
    }
}
