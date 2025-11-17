package com.sena.crudbasic.entity;
import jakarta.persistence.*;

@Entity @Table(name="direcciones")
public class Direccion {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idDireccion;
    private String direccion;
    private String ciudad;
    private String pais;

    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;
}
