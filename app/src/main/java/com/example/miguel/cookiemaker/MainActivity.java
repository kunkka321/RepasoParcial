package com.example.miguel.cookiemaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText eteNombre;
    public static final int cod_req=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eteNombre=(EditText) findViewById(R.id.eteNombre);
        Button butIngresar=(Button) findViewById(R.id.butIngresar);
        butIngresar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v==findViewById(R.id.butIngresar)) {



        Intent intent = new Intent();
        intent.setClass(this, Destino.class);
        Bundle data = new Bundle();
        data.putString("NOMBRE", eteNombre.toString());
        intent.putExtras(data);
        startActivityForResult(intent, cod_req);
    }
    }
}
