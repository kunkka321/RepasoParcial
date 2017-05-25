package com.example.miguel.cookiemaker;

import java.util.ArrayList;
import java.util.List;

public class RecetasManager {
    private static RecetasManager instance = null;

    private List<Receta> mRecetas;
    private List<Ingrediente> mIngredientes;

    public static RecetasManager getInstance(){
        if (instance == null){
            instance = new RecetasManager();
        }
        return instance;
    }

    private RecetasManager() {
        mIngredientes = new ArrayList<>();
        mIngredientes.add(new Ingrediente("Mantequilla"));
        mIngredientes.add(new Ingrediente("Azucar"));
        mIngredientes.add(new Ingrediente("Harina"));
        mIngredientes.add(new Ingrediente("Vainilla"));
        mIngredientes.add(new Ingrediente("Polvo de hornear"));

    }

    public List<Receta> getRecetas(){
        return mRecetas;
    }

    public void addReceta(Receta receta){
        if (mRecetas == null){
            mRecetas = new ArrayList<>();
        }
        mRecetas.add(receta);
    }

    public Receta getReceta(int id){

       return RecetasManager.getInstance().getReceta(id);

        // Debe implementarlo !!Listo
    }

    public List<Ingrediente> getIngredientes(){
        return mIngredientes;
    }



}