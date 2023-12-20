package com.solocubos.exfinal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solocubos.exfinal.DTO.EntrenadorUuidDTO;
import com.solocubos.exfinal.entity.Pokemon;
import com.solocubos.exfinal.repository.EntrenadorRepository;

@Service
public class EntrenadorService {

    @Autowired
    EntrenadorRepository entrenadorRepository;

    public EntrenadorUuidDTO obtenerUuid(String email) throws Exception{
        try {
            String uuid = entrenadorRepository.findByEmail(email).getUuid();
            return new EntrenadorUuidDTO(uuid);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        } 
    }

    public List<Pokemon> obtenerPokemones(String uuid) throws Exception{
        List<Pokemon> pokemones = new ArrayList<>();
        try {
            pokemones = entrenadorRepository.findByUuid(uuid).getPokemones();
            return pokemones;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        } 
    
    }
}
