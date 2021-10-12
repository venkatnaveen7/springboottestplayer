package com.idc.springboottestplayer.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Player {
    @Id
    private String id;
    private String name;
    private String positionOfPlay;
    private Integer rating;

    @ManyToOne
    private Country country;

    public Player(String id, String name, String positionOfPlay, Integer rating, Country country) {
        this.id = id;
        this.name = name;
        this.positionOfPlay = positionOfPlay;
        this.rating = rating;
        this.country = country;
    }

    public Player() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPositionOfPlay() {
        return positionOfPlay;
    }

    public void setPositionOfPlay(String positionOfPlay) {
        this.positionOfPlay = positionOfPlay;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
