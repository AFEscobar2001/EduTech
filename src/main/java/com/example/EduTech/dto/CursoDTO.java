package com.example.EduTech.dto;

public class CursoDTO {
    private String codigo;
    private String nombre;
    private String descripcion;
    private String rut;

    public CursoDTO() {
        this.codigo = "";
        this.nombre = "";
        this.descripcion = "";
        this.rut = "";
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

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    

}
