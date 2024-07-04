package com.vestiapp.proyecto_vestiapp.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity 
@Getter @Setter
public class Proveedor {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(length=50) 
    @Required  
    String nombre;
	
	@Embedded 
    Direccion direccion; 
	
	@OneToMany(mappedBy="proveedor")
	Collection<Prenda> prendas;
}
