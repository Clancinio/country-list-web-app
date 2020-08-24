package com.deanclancydev.countrylistwebapp.controller;

import com.deanclancydev.countrylistwebapp.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    // Display a list of all Countries
    // Method handler for home page (index.html) to display list of countries
    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listCountries", countryService.getAllCountries());
        return "index";
    }
}
