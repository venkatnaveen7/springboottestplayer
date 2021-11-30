package com.idc.springboottestplayer.repositories;

import com.idc.springboottestplayer.model.Country;
import com.idc.springboottestplayer.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player,String> {
    @Query("select p from Player p where p.country.continent   = ?1")
    List<Player> findPlayerInContinent(String Continent);

    @Query("select p from Player p where p.country.code   = ?1")
    List<Player> findPlayerByCountryCode(String code);

    List<Player> findPlayersByRatingGreaterThanEqual(Integer rating);
    
    /*
    These method should also work
    List<Player> findByCountryCode(String country);
	List<Player> findByCountryContinent(String country);
	List<Player> findByRating(Integer rating);
    */
}
