package br.com.max.addresmanager.dto;

import br.com.max.addresmanager.entity.Address;
import br.com.max.addresmanager.entity.Person;
import br.com.max.addresmanager.service.PersonService;

public class AddressDTO {
    private String publicPlace;
    private Integer number;
    private String complement;
    private String district;
    private String city;
    private String state;
    private String zipCode;
    private Long personId;

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Address toModel(PersonService personService) {
        Person person = personService.findById(personId);
        return new Address(publicPlace, number, complement, district, city, state, zipCode, person);
    }

}
