package com.poryectofinal.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class panelquisqui extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panelquisqui);
    }

    public void Slide(View vista)
    {
        Intent Pasada = new Intent(this, consejos.class);
        startActivity(Pasada);
    }
}
