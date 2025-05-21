package com.example.EduTech.dto;

public class ReseniaDTO {

    private int usuario_id;
    private int curso_id;
    private String comentario;
    private int califcacion;

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getCurso_id() {
        return curso_id;
    }
    
    public void setCurso_id(int curso_id) {
        this.curso_id = curso_id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getCalifcacion() {
        return califcacion;
    }

    public void setCalifcacion(int califcacion) {
        this.califcacion = califcacion;
    }


}
