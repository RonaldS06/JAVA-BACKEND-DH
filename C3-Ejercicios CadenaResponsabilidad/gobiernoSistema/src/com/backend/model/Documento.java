package com.backend.model;

public class Documento {
    private String contenido;
    private Integer nivelAcceso;

    public Documento(String contenido, Integer nivelAcceso) {
        this.contenido = contenido;
        this.nivelAcceso = nivelAcceso;
    }

    public String getContenido(){
        return contenido;
    }
    public void setContenido(String contenido){
        this.contenido = contenido;
    }

    public Integer getNivelAcceso() {
        return nivelAcceso;
    }
    public void setNivelAcceso(Integer nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }
}
