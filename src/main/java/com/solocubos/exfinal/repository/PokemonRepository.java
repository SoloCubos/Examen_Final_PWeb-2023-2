package com.solocubos.exfinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solocubos.exfinal.entity.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Integer>{

}
