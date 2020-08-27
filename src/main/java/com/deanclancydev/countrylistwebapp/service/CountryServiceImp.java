package com.deanclancydev.countrylistwebapp.service;

import com.deanclancydev.countrylistwebapp.model.Country;
import com.deanclancydev.countrylistwebapp.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImp implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    // This method saves a country to the database
    @Override
    public void saveCountry(Country country) {
        this.countryRepository.save(country);
    }

    @Override
    public Country getCountryById(long id) {
        Optional<Country> optional = countryRepository.findById(id);
        Country country = null;
        if (optional.isPresent()) {
            country = optional.get();
        } else {
            throw new RuntimeException("Country not found for id :: " + id);
        }
        return country;
    }
}