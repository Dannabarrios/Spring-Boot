package com.sena.crudbasic.entity;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity @Table(name="ordenes")
public class Orden {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idOrden;
    private Double total;
    @Column(columnDefinition="TIMESTAMP")
    private Timestamp fechaOrden;

    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name="id_metodo")
    private MetodoPago metodoPago;

    @OneToMany(mappedBy="orden")
    private List<DetalleOrden> detalles;
}
