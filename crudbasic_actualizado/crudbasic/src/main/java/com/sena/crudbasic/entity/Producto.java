package com.sena.crudbasic.entity;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity @Table(name="productos")
public class Producto {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idProducto;
    private String nombre;
    private String descripcion;
    private Double precio;
    @Column(columnDefinition="TIMESTAMP")
    private Timestamp fechaCreacion;

    @ManyToMany
    @JoinTable(name="producto_categoria",
        joinColumns=@JoinColumn(name="id_producto"),
        inverseJoinColumns=@JoinColumn(name="id_categoria"))
    private List<Categoria> categorias;

    @OneToOne(mappedBy="producto")
    private Inventario inventario;

    @OneToMany(mappedBy="producto")
    private List<DetalleOrden> detalles;
}
