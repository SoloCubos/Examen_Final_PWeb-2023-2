package com.solocubos.exfinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solocubos.exfinal.entity.Entrenador;

@Repository
public interface EntrenadorRepository extends JpaRepository<Entrenador, Integer>{

    public Entrenador findByEmail(String email);

    public Entrenador findByUuid(String uuid);


}
