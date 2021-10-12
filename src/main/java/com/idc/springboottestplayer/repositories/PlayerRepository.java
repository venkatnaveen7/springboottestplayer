package com.idc.springboottestplayer.repositories;

import com.idc.springboottestplayer.model.Country;
import com.idc.springboottestplayer.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player,String> {

}
