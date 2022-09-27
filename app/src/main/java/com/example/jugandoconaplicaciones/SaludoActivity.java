package com.example.jugandoconaplicaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {
TextView saludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        saludo = findViewById(R.id.textViewSaludo);

        Intent intent = getIntent();
        String nombre = intent.getStringExtra(MainActivity.NOMBRE);
        saludo.setText("Hola "+nombre);
    }
}