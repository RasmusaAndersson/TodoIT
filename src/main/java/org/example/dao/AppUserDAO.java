package org.example.dao;

import java.util.Collection;

public interface AppUserDAO<AppUser, Integer> {

    AppUser persist(AppUser appUser);


    org.example.AppUser persist(org.example.AppUser appUser);

    AppUser findByUsername(String username);


    Collection<AppUser> findAll();


    void remove(String username);
}