package com.progavanzada.taller.mecanico.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.progavanzada.taller.mecanico.entities.objects.RegExPatterns;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * Marca de un vehiculo
 */
@Entity
@Table(name = "tm_marcas")
public class Marca {

    /**
     * El ID único que representa esta marca.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    /**
     * Un nombre visual sobre que marca es.
     */
    @Size(min = 4, max = 32, message = "El nombre de una marca no puede superar los 32 caractéres.")
    @Column(nullable = false, length = 32)
    @NotNull
    public String name;
    
    @Size(min = 4, max = 32, message = "El origen de una marca no puede superar los 32 caractéres.")
    @Column(nullable = false, length = 32)
    @NotNull
    public String origen;

    /**
     * Flag que denota si la entidad fue eliminada o no.
     */
    @Column(nullable = false)
    @JsonIgnore
    public boolean eliminado = false;
}
