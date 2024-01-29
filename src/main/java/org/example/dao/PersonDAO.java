package org.example.dao;

import java.util.Collection;

public interface PersonDAO<Person, Integer> {

    Person persist(Person Person);


    org.example.Person persist(org.example.Person Person);

    Person findByUsername(String username);


    Collection<Person> findAll();


    void remove(String username);
}