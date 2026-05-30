package com.eazybytes.render_lab2.service;

import com.eazybytes.render_lab2.entity.Person;
import com.eazybytes.render_lab2.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public List<Person> getAll() {
        return personRepository.findAll();
    }

    public Person getById(Long id) {
        return personRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Person not found"));
    }

    public void delete(Long id) {
        personRepository.deleteById(id);
    }
}