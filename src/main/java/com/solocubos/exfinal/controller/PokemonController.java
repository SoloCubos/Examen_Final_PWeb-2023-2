package com.solocubos.exfinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solocubos.exfinal.entity.Pokemon;
import com.solocubos.exfinal.service.PokemonService;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping(path = "/pokemons")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @PostMapping(path = "/")
    public ResponseEntity<?> savePokemon(@RequestBody Pokemon pokemon){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(pokemonService.save(pokemon));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error 69, Por favor intente mas tarde: " + e + " .\"}");
        }
    }
}
