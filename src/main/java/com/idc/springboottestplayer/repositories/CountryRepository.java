package com.idc.springboottestplayer.repositories;

import com.idc.springboottestplayer.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country,String> {

}
