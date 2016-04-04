package com.calyrsoftware.app1.myapp.model;

/**
 * Created by calyr on 11/2/15.
 */
public class Ordenanzasyleyes {

    private String titulo;
    private String descripcion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Ordenanzasyleyes(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }
}
