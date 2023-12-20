package com.solocubos.exfinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solocubos.exfinal.entity.TipoPokemon;

@Repository
public interface TipoPokemonRepository extends JpaRepository<TipoPokemon, Integer>{

}
