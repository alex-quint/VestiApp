package com.vestiapp.proyecto_vestiapp.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity 
@Getter @Setter
public class Prenda {
	 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length=50) 
    @Required  
    String nombre;
    
    @ManyToOne
    @DescriptionsList
    Categoria categoria;
    
    @ManyToOne
    @DescriptionsList
    Tienda tienda;
    
    @ManyToOne
    @JoinColumn(name="proveedor_id")
    private Proveedor proveedor;
    
    @Money
    double precio;
    
    @Column(length=10) 
    @Required  
    String talla;
    
    @Column(length=10) 
    @Required  
    String color;
}
