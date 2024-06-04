package com.vestiapp.proyecto_vestiapp.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity 
@Getter @Setter
public class Proveedor {
	
	@Id  
    @Column(length=6) 
    int identificador;
	
	@Column(length=50) 
    @Required  
    String nombre;
	
	@Embedded 
    Direccion direccion; 
	
	@DescriptionsList
	Collection<Prenda> prendas;
}
