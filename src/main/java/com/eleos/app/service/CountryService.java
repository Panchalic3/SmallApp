package com.eleos.app.service;

import com.eleos.app.controller.CountryController;
import com.eleos.app.db.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {
	// TODO
    List<Country> country = new ArrayList<>();
    public CountryService(){
        country.add(new Country(000,"DUMMY"));
    }
    @Bean
    public List<Country> getCountry(){
        System.out.println(country);
        return country;
    }

    // methods that will access the bean class
}
