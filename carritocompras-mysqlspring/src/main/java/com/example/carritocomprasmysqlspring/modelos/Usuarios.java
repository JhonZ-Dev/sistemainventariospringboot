package com.example.carritocomprasmysqlspring.modelos;

import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Entity
@Table(name = "tb_usuarios")
@Data
@Slf4j
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    private String nombres;
    private String email;
    private String password_user;
    private String id_rol;
}
