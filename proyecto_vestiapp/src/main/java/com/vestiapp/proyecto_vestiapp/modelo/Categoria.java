package com.vestiapp.proyecto_vestiapp.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
 
@Entity
@Getter @Setter
public class Categoria{

    @Id  
    @Column(length=6) 
    int numero;
    
    @Column(length=50)
    String descripcion;
 
	@DescriptionsList
	Collection<Prenda> prendas;
}
