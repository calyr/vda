package com.calyrsoftware.app1.myapp.model;

/**
 * Created by callisaya on 29/10/15.
 */
public class Menuprincipal {
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagenId() {
        return imagenId;
    }

    public void setImagenId(int imagenId) {
        this.imagenId = imagenId;
    }

    private String titulo;
    private int imagenId;

    public Menuprincipal(String titulo, int imagenId) {
        this.titulo = titulo;
        this.imagenId = imagenId;
    }
}
