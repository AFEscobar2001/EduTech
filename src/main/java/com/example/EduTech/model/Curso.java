package com.example.EduTech.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codigo;
    private String nombre;
    private String descripcion;
    private Usuario instructor;
    private double valor_curso;

    @ManyToOne
    @JoinColumn(name = "usuario_rut", referencedColumnName = "rut")
    @JsonBackReference
    private Usuario usuario;

    public Curso() {
        this.codigo = "";
        this.nombre = "";
        this.descripcion = "";
        this.valor_curso = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getInstructor() {
        return instructor;
    }

    public void setInstructor(Usuario instructor) {
        this.instructor = instructor;
    }

    public double getValor_curso() {
        return valor_curso;
    }

    public void setValor_curso(double valor_curso) {
        this.valor_curso = valor_curso;
    }
 

}
