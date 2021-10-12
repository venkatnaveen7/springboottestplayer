package com.idc.springboottestplayer.controllers;

import com.idc.springboottestplayer.model.Country;
import com.idc.springboottestplayer.model.Player;
import com.idc.springboottestplayer.services.CountryServices;
import com.idc.springboottestplayer.services.PlayerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    private PlayerServices pService;

    @Autowired
    private CountryServices cService;

    @GetMapping(value = "/players")
    public List<Player> getPlayers(){
        return pService.getPlayers();
    }


    @GetMapping(value = "/players/country/{country_code}")
    public List<Player> getPlayersByCountry(@PathVariable String country_code){
        return pService.getPlayers();
    }

    @GetMapping(value = "/players/continent/{continent}")
    public List<Player> getPlayersByContinent(@PathVariable String continent){
        return pService.getPlayers();
    }


    @GetMapping(value = "/players/rating/{rating}")
    public List<Player> getPlayersGreaterThanRating(@PathVariable Integer rating){

        return pService.getPlayers();
    }
}
