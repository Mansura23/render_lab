package com.eazybytes.render_lab2.repository;



import com.eazybytes.render_lab2.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}