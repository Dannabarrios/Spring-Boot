package com.sena.crudbasic.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity @Table(name="roles")
public class Rol {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idRol;
    private String nombreRol;
    @ManyToMany(mappedBy="roles")
    private List<Usuario> usuarios;
}
