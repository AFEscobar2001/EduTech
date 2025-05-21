package com.example.EduTech.dto;

public class InscripcionDTO {
    private String usuario_rut;
    private int curso_id;
    private String fecha_inscripcion;

    public String getUsuario_rut() {
        return usuario_rut;
    }

    public void setUsuario_rut(String usuario_rut) {
        this.usuario_rut = usuario_rut;
    }

    public int getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(int curso_id) {
        this.curso_id = curso_id;
    }

    public String getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public void setFecha_inscripcion(String fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }


}
