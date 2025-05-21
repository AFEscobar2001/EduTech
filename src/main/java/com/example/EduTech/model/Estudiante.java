package com.example.EduTech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Estudiante {
    @Id
    private String rut;
    private String nombre;
    private String apellido;
    private String correo;

    public Estudiante() {
        this.rut = "";
        this.nombre = "";
        this.apellido = "";
        this.correo = "";
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    

}
