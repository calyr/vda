package com.calyrsoftware.app1.myapp.model;

/**
 * Created by Roberto on 22/10/2015.
 */
public class Fraternidadesfolkloricas {

    private String categoria;

    public Fraternidadesfolkloricas(String categoria, String nombre, String horarioingreso, String descripcion) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.horarioingreso = horarioingreso;
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorarioingreso() {
        return horarioingreso;
    }

    public void setHorarioingreso(String horarioingreso) {
        this.horarioingreso = horarioingreso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private String nombre;
    private String horarioingreso;
    private String descripcion;

}
