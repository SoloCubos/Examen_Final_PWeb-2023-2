package com.solocubos.exfinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solocubos.exfinal.entity.Pueblo;

@Repository
public interface PuebloRepository extends JpaRepository<Pueblo, Integer>{

}
