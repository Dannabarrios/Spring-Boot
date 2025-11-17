package com.sena.crudbasic.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity @Table(name="metodos_pago")
public class MetodoPago {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idMetodo;
    private String nombreMetodo;

    @OneToMany(mappedBy="metodoPago")
    private List<Orden> ordenes;
}
