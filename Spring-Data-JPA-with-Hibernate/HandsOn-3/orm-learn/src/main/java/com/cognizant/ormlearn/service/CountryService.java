package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    // Get all countries
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    // Find country by code
    public Country findCountryByCode(String code) {
        return countryRepository.findById(code).orElse(null);
    }

    // Add new country
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    // Search countries containing text
    public List<Country> searchCountries(String text) {
        return countryRepository.findByNameContaining(text);
    }

    // Search countries containing text sorted by name
    public List<Country> searchCountriesSorted(String text) {
        return countryRepository.findByNameContainingOrderByNameAsc(text);
    }

    // Countries starting with a letter
    public List<Country> getCountriesStartingWith(String alphabet) {
        return countryRepository.findByNameStartingWith(alphabet);
    }

}