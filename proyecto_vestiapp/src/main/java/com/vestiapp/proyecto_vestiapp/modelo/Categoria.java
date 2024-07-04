package com.vestiapp.proyecto_vestiapp.modelo;

import java.util.*;

import javax.persistence.*;

import lombok.*;
 
@Entity
@Getter @Setter
public class Categoria{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length=50)
    String descripcion;
 
    @OneToMany(mappedBy="categoria")
	Collection<Prenda> prendas;
}
