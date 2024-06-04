package com.vestiapp.proyecto_vestiapp.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity 
@Getter @Setter
public class Prenda {
	 
    @Id  
    @Column(length=6) 
    int numero;
    
    @Column(length=50) 
    @Required  
    String nombre;
    
    @DescriptionsList
    Categoria categoria;
    
    @DescriptionsList
    Tienda tienda;
    
    @Money
    double precio;
    
    @Column(length=10) 
    @Required  
    String talla;
    
    @Column(length=10) 
    @Required  
    String color;
}
