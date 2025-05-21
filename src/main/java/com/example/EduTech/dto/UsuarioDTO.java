package com.example.EduTech.dto;

import java.util.List;

public class UsuarioDTO {
    private String rut;
    private String contrasena;
    private List <String> roles;

    public UsuarioDTO() {
        this.rut = "";
        this.contrasena = "";
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

}
