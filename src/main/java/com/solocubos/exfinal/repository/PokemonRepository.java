package com.solocubos.exfinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.solocubos.exfinal.entity.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Integer>{

    @Query("SELECT p FROM Pokemon p WHERE p.tipoPokemon.uuid = :tipoUuid")
    public Pokemon findByTipoPokemonUuid(@Param("tipoUuid") String tipo);
    //No pues que no se iban a meter JPA Querys?
}
