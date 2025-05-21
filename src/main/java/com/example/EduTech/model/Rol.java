package com.example.EduTech.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @ManyToMany(mappedBy = "rol",cascade = CascadeType.ALL)
    private List<Usuario> lista_Usuarios;

    public Rol() {
        this.nombre = "";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuario> getLista_Usuarios() {
        return lista_Usuarios;
    }

    public void setLista_Usuarios(List<Usuario> lista_Usuarios) {
        this.lista_Usuarios = lista_Usuarios;
    }


}
