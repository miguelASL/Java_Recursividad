package org.sarmiento.recursividad.ejemplo.models;

import java.util.ArrayList;
import java.util.List;

public class Componente {
    private String nombre;
    private List<Componente> hijos;

    public Componente(String nombre) {
        this.nombre = nombre;
        this.hijos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Componente> getHijos() {
        return hijos;
    }

    public void setHijos(List<Componente> hijos) {
        this.hijos = hijos;
    }

    public Componente addComponente(Componente c){
        this.hijos.add(c);
        return this;
    }

    public boolean tieneHijos(){
        return !this.hijos.isEmpty();
    }
}
