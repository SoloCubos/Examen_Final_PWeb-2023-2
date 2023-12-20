package com.solocubos.exfinal.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "entrenador")
@NoArgsConstructor
@AllArgsConstructor
public class Entrenador implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "email")
    private String email;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "fecha_vinculacion")
    private Date fechaVinculacion;

    @OneToOne
    @JoinColumn(name = "pueblo_id")
    private Pueblo pueblo;

    @Column(name = "uuid")
    private String uuid;

    @ManyToMany
    @JoinTable(
        name = "entrenador_pokemon", 
        joinColumns = @JoinColumn(name = "entrenador_id"),
        inverseJoinColumns = @JoinColumn(name = "pokemon_id")
    )
    private List<Pokemon> pokemones;
}
