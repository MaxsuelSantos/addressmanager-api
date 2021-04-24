package br.com.max.addresmanager.controller;

import br.com.max.addresmanager.dto.AddressDTO;
import br.com.max.addresmanager.service.AddressService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController {

    private AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping
    public void createAddress(@RequestBody AddressDTO addressDTO) {
        addressService.createAddress(addressDTO);
    }
}
