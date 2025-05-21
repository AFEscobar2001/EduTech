package com.example.EduTech.dto;

public class MetodoPagoDTO {
    private String tipo;             
    private String entidad;          
    private String ultimosDigitos;   

    public MetodoPagoDTO() {}

    public MetodoPagoDTO(String tipo, String entidad, String ultimosDigitos) {
        this.tipo = tipo;
        this.entidad = entidad;
        this.ultimosDigitos = ultimosDigitos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getUltimosDigitos() {
        return ultimosDigitos;
    }

    public void setUltimosDigitos(String ultimosDigitos) {
        this.ultimosDigitos = ultimosDigitos;
    }
    
}
