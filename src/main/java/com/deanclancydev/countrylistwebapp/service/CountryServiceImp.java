package com.deanclancydev.countrylistwebapp.service;

import com.deanclancydev.countrylistwebapp.model.Country;
import com.deanclancydev.countrylistwebapp.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CountryServiceImp implements CountryService{

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
