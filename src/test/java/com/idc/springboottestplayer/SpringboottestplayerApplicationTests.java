package com.idc.springboottestplayer;

import com.idc.springboottestplayer.model.Player;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringboottestplayerApplicationTests {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    @DisplayName("It should send all players details")
    void getPlayersApiTest(){
        String url = "/players";
        //String response = this.testRestTemplate.getForObject(url,String.class);
         ResponseEntity<Player[]> response = this.testRestTemplate.getForEntity(url, Player[].class);
        assertEquals(12,response.getBody().length);
    }

    @Test
    @DisplayName("It should send all players in a country (Country Code)")
    void getPlayersByCuntryApiTest(){
        String url = "/players/country/ARG";
        //String response = this.testRestTemplate.getForObject(url,String.class);
        ResponseEntity<Player[]> response = this.testRestTemplate.getForEntity(url, Player[].class);
        List<Player> players = Arrays.asList(response.getBody());
        //number of players should be 3
        assertEquals(3,response.getBody().length);
        for(Player player : players){
            assertEquals("ARG",player.getCountry().getCode());
        }
    }

    @Test
    @DisplayName("It should send all players by continent ")
    void getPlayersByContinentApiTest(){
        String url = "/players/continent/Europe";
        //String response = this.testRestTemplate.getForObject(url,String.class);
        ResponseEntity<Player[]> response = this.testRestTemplate.getForEntity(url, Player[].class);
        List<Player> players = Arrays.asList(response.getBody());
        //number of players should be 3
        assertEquals(5,response.getBody().length);
        for(Player player : players){
            assertEquals("Europe",player.getCountry().getContinent());
        }
    }

    @Test
    @DisplayName("It should send all players by rating greater than 92 ")
    void getPlayersGreaterThanProvidedRatingApiTest(){
        String url = "/players/rating/92";
        //String response = this.testRestTemplate.getForObject(url,String.class);
        ResponseEntity<Player[]> response = this.testRestTemplate.getForEntity(url, Player[].class);
        List<Player> players = Arrays.asList(response.getBody());
        //number of players should be 3
        assertEquals(8,response.getBody().length);

    }

}
