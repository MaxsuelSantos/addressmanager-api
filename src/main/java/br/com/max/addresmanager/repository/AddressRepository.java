package br.com.max.addresmanager.repository;

import br.com.max.addresmanager.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
