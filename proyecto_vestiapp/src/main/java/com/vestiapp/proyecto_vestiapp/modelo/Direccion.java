package com.vestiapp.proyecto_vestiapp.modelo;

import javax.persistence.*;

import lombok.*;
 
@Embeddable
@Getter @Setter
public class Direccion {
 
    @Column(length = 30)
    String viaPrincipal;
 
    @Column(length = 5)
    int codigoPostal;
 
    @Column(length = 30)
    String provincia;
 
}
