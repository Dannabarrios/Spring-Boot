package com.sena.crudbasic.entity;
import jakarta.persistence.*;

@Entity @Table(name="detalle_orden")
public class DetalleOrden {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idDetalle;

    private Integer cantidad;
    private Double precioUnitario;

    @ManyToOne
    @JoinColumn(name="id_orden")
    private Orden orden;

    @ManyToOne
    @JoinColumn(name="id_producto")
    private Producto producto;
}
