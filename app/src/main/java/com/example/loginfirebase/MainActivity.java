package com.example.loginfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Inicio (View view){
        Intent iniciar = new Intent(this, IniciarSesion.class);
        startActivity(iniciar);
    }

    public void registro (View view){
        Intent registrarse = new Intent(this, Registrarse.class);
        startActivity(registrarse);
    }
}