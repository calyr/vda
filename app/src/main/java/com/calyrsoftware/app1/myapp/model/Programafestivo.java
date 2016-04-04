package com.calyrsoftware.app1.myapp.model;

/**
 * Created by Roberto on 22/10/2015.
 */
public class Programafestivo {

    public Programafestivo(String titulo, String descripcion, String fecha, String horario){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.horario = horario;
    }

    private String fecha;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

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

    private String horario;
    private String titulo;
    private String descripcion;
}
