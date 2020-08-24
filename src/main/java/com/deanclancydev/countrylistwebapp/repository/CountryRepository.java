package com.deanclancydev.countrylistwebapp.repository;

import com.deanclancydev.countrylistwebapp.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
