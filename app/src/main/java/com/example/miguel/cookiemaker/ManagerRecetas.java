package com.example.miguel.cookiemaker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miguel on 23/05/2017.
 */

public class ManagerRecetas {

    public List<Receta> obtenerRecetas(){

        List<Receta> recetas=new ArrayList<>();

        recetas.add(new Receta(1,"galletas","jose"));
        recetas.add(new Receta(1,"pasteles","Maria"));

        return recetas;
    }
}
