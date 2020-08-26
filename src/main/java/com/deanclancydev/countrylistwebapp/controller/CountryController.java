package com.deanclancydev.countrylistwebapp.controller;

import com.deanclancydev.countrylistwebapp.model.Country;
import com.deanclancydev.countrylistwebapp.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    // Display a list of all Countries on the index page
    // Method handler for home page (index.html) to display list of countries
    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listCountries", countryService.getAllCountries());
        return "index";
    }

    @GetMapping("/showNewCountryForm")
    public String showNewCountryForm(Model model){
        Country country = new Country();
        // Thymleaf template will access this empty country object for binding form data
        //                      key      value
        model.addAttribute("country", country);
        return "new_country";
    }

    @PostMapping("/saveCountry")
    public String saveCountry(@ModelAttribute("country") Country country){
        // Save to database
        countryService.saveCountry(country);
        return "redirect:/";
    }
}
