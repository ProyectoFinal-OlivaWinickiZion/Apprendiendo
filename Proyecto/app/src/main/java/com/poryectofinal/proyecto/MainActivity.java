package com.poryectofinal.proyecto;

import android.content.Intent;
import android.support.annotation.BoolRes;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private Adaptador_ViewPagerPrincipal Adaptador_ViewPagerPrincipal;
    private ViewPager ViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.ToolbarPrincipal);
        setSupportActionBar(toolbar);
        TabLayout tabLayout = (TabLayout)findViewById(R.id.TabLayoutPrincipal);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);

        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());
        // Iniciamos el viewPager.
        ViewPager = (ViewPager) findViewById(R.id.ViewPagerPrincipal);

        // Creamos el adaptador, al cual le pasamos por parámtro el gestor de Fragmentos y muy importante, el nº de tabs o secciones que hemos creado.
         Adaptador_ViewPagerPrincipal = new Adaptador_ViewPagerPrincipal(getSupportFragmentManager(),tabLayout.getTabCount());

        // Y los vinculamos.
        ViewPager.setAdapter(Adaptador_ViewPagerPrincipal);
        tabLayout.setupWithViewPager(ViewPager);
    }




}