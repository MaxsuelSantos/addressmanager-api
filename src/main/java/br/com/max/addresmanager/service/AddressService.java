package br.com.max.addresmanager.service;

import br.com.max.addresmanager.dto.AddressDTO;
import br.com.max.addresmanager.entity.Address;
import br.com.max.addresmanager.repository.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    private PersonService personService;
    private AddressRepository addressRepository;

    public AddressService(PersonService personService, AddressRepository addressRepository) {
        this.personService = personService;
        this.addressRepository = addressRepository;
    }

    public void createAddress(AddressDTO addressDTO) {
        Address address = addressDTO.toModel(personService);
        addressRepository.save(address);
    }
}
