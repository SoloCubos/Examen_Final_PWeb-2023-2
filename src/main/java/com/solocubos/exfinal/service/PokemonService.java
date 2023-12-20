package com.solocubos.exfinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solocubos.exfinal.entity.Pokemon;
import com.solocubos.exfinal.repository.PokemonRepository;
import java.util.ArrayList;

@Service
public class PokemonService {

    @Autowired
    PokemonRepository pokemonRepository;

    public List<Pokemon> obtenerPokemones() throws Exception{
        List<Pokemon> pokemones = new ArrayList<>();
        try {
            pokemones = pokemonRepository.findAll();
            return pokemones;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Pokemon save(Pokemon pokemon) throws Exception{
        try {
            return pokemonRepository.save(pokemon);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
