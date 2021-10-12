package com.idc.springboottestplayer.services;

import com.idc.springboottestplayer.model.Country;
import com.idc.springboottestplayer.model.Player;
import com.idc.springboottestplayer.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServices {

    @Autowired
    private PlayerRepository pRepository;


    public List<Player> getPlayers() {
        return pRepository.findAll();
    }
    public List<Player> getPlayersByCountryCode(String countryCode) {
        return pRepository.findPlayerByCountryCode(countryCode);
    }

    public List<Player> getPlayersByContinent(String continent){
        return pRepository.findPlayerInContinent(continent);
    }

    public List<Player> getPlayersGreaterThanRating(Integer rating){
        return pRepository.findPlayersByRatingGreaterThanEqual(rating);
    }
}
