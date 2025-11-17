package com.sena.crudbasic.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity @Table(name="categorias")
public class Categoria {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idCategoria;
    private String nombreCategoria;

    @ManyToMany(mappedBy="categorias")
    private List<Producto> productos;
}
