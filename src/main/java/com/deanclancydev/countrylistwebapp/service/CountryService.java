package com.deanclancydev.countrylistwebapp.service;

import com.deanclancydev.countrylistwebapp.model.Country;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CountryService {

    // CountryService Methods
    List<Country> getAllCountries();
    void saveCountry(Country country);

}
