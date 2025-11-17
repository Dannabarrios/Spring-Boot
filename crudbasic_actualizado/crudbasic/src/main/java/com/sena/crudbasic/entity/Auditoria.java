package com.sena.crudbasic.entity;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity @Table(name="auditoria")
public class Auditoria {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idAuditoria;

    private String accion;

    @Column(columnDefinition="TIMESTAMP")
    private Timestamp fecha;

    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;
}
