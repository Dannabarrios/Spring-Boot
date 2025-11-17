package com.sena.crudbasic.entity;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity @Table(name="inventarios")
public class Inventario {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idInventario;
    private Integer cantidad;
    @Column(columnDefinition="TIMESTAMP")
    private Timestamp ultimaActualizacion;

    @OneToOne
    @JoinColumn(name="id_producto")
    private Producto producto;
}
