package com.sena.crudbasic.entity;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    private String nombre;
    private String apellido;
    @Column(unique = true)
    private String email;
    private String telefono;
    @Column(columnDefinition = "TIMESTAMP")
    private Timestamp fechaRegistro;

    @OneToMany(mappedBy = "usuario")
    private List<Direccion> direcciones;

    @ManyToMany
    @JoinTable(name="usuario_rol",
        joinColumns=@JoinColumn(name="id_usuario"),
        inverseJoinColumns=@JoinColumn(name="id_rol"))
    private List<Rol> roles;

    @OneToMany(mappedBy="usuario")
    private List<Orden> ordenes;

    @OneToMany(mappedBy="usuario")
    private List<Auditoria> auditorias;
}
