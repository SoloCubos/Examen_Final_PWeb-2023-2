package com.solocubos.exfinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solocubos.exfinal.DTO.EntrenadorLoginDTO;
import com.solocubos.exfinal.service.EntrenadorService;

@RestController
@RequestMapping(path = "/entrenador")
public class EntrenadorController {

    @Autowired
    EntrenadorService entrenadorService;

    @PostMapping(path ="/login")
    public ResponseEntity<?> login(@RequestBody EntrenadorLoginDTO loginDTO){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(entrenadorService.obtenerUuid(loginDTO.getEmail()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}
