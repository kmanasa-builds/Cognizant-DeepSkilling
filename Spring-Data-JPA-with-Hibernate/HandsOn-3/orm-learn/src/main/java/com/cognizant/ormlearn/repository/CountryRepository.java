package com.cognizant.ormlearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    // Find countries containing a given text
    List<Country> findByNameContaining(String text);

    // Find countries containing text and sort by name
    List<Country> findByNameContainingOrderByNameAsc(String text);

    // Find countries starting with a given letter
    List<Country> findByNameStartingWith(String alphabet);

}