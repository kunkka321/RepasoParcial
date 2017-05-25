package com.example.miguel.cookiemaker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by Miguel on 20/05/2017.
 */

public class Destino extends Activity implements View.OnClickListener{
    ListView listaReceta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destino);

        Button butAgregar=(Button) findViewById(R.id.butAgregar);
        listaReceta=(ListView) findViewById(R.id.listaRecetas);

        ManagerRecetas managerRecetas=new ManagerRecetas();




        butAgregar.setOnClickListener(this);
        Intent intent=getIntent();
        Bundle data=intent.getExtras();
        String usuario=data.getString("NOMBRE");

        managerRecetas.obtenerRecetas().add(new Receta(1,usuario,"Galletitas"));

        ListadoRecetasAdapter adapter=new ListadoRecetasAdapter(this,managerRecetas.obtenerRecetas());
        listaReceta.setAdapter(adapter);

    }


    @Override
    public void onClick(View v) {



    }
}
