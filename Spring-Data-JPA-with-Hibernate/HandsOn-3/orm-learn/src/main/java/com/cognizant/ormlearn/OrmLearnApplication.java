package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

        countryService = context.getBean(CountryService.class);

        LOGGER.info("Inside main");

        // Uncomment only the methods you want to test

        //testGetAllCountries();

        //testFindCountryByCode();

        //testAddCountry();

        testSearchCountries();
        //testSearchCountriesSorted();

        //testCountriesStartingWith();

    }

    private static void testGetAllCountries() {

        LOGGER.info("Start");

        List<Country> countries = countryService.getAllCountries();

        LOGGER.debug("Countries = {}", countries);

        LOGGER.info("End");

    }

    private static void testFindCountryByCode() {

        LOGGER.info("Start");

        Country country = countryService.findCountryByCode("IN");

        LOGGER.debug("Country = {}", country);

        LOGGER.info("End");

    }

    private static void testAddCountry() {

        LOGGER.info("Start");

        Country country = new Country();

        country.setCode("JP");

        country.setName("Japan");

        countryService.addCountry(country);

        Country result = countryService.findCountryByCode("JP");

        LOGGER.debug("Country = {}", result);

        LOGGER.info("End");

    }

    private static void testSearchCountries() {

        LOGGER.info("Start");

        List<Country> countries = countryService.searchCountries("an");

        LOGGER.debug("Countries = {}", countries);

        LOGGER.info("End");

    }

    private static void testSearchCountriesSorted() {

        LOGGER.info("Start");

        List<Country> countries = countryService.searchCountriesSorted("an");
        LOGGER.debug("Countries = {}", countries);

        LOGGER.info("End");

    }

    private static void testCountriesStartingWith() {

        LOGGER.info("Start");

        List<Country> countries = countryService.getCountriesStartingWith("J");


        LOGGER.debug("Countries = {}", countries);

        LOGGER.info("End");

    }

}