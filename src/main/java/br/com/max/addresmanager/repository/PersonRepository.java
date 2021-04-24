package br.com.max.addresmanager.repository;

import br.com.max.addresmanager.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
