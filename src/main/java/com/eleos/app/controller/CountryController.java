package com.eleos.app.controller;

import com.eleos.app.db.Country;
import com.eleos.app.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
	// TODO
    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public List<Country> getCountry(){
        return this.countryService.getCountry();

    }
}
