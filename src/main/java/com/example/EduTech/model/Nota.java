package com.example.EduTech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_nota;
    private String descripcion;
    private Double nota;

    @ManyToOne
    @JoinColumn(name = "curso_codigo", referencedColumnName = "codigo")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "usuario_rut", referencedColumnName = "rut")
    private Usuario usuario;

    public Nota() {
        this.id_nota = 0;
        this.descripcion = "";
        this.nota = 0.0;
    }

    public Integer getId_nota() {
        return id_nota;
    }

    public void setId_nota(Integer id_nota) {
        this.id_nota = id_nota;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    

}
