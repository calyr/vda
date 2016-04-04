package com.calyrsoftware.app1.myapp.model;

/**
 * Created by Roberto on 26/10/2015.
 */
public class Mensajedelalcalde {

    private String nombre;
    private String titulo;
    private String mensaje;

    public Mensajedelalcalde(String nombre, String titulo, String mensaje) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.mensaje = mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
