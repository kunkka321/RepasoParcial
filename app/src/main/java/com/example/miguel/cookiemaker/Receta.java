package com.example.miguel.cookiemaker;

import java.util.ArrayList;
import java.util.List;

public class Receta {
    private int id;
    private String nombre;
    private String usuario;
    private List<Ingrediente> ingredientes;

    public Receta(int id, String nombre, String usuario) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
    }

    public Receta(int id, String nombre, String usuario, List<Ingrediente> ingredientes) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.ingredientes = ingredientes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void agregarIngrediente(Ingrediente ingrediente){
        if (ingredientes == null){
            ingredientes = new ArrayList<>();
        }
        ingredientes.add(ingrediente);
    }
}