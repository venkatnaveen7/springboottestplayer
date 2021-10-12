package com.idc.springboottestplayer.services;

import com.idc.springboottestplayer.model.Country;
import com.idc.springboottestplayer.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServices {

    @Autowired
    private CountryRepository cRepository;

    public List<Country> getCountryByContinent(String continent) {
         return null;
    }
}
