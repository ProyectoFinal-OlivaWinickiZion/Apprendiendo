package com.poryectofinal.proyecto;

import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

import com.poryectofinal.proyecto.R;

public class ActividadPrincipal extends AppCompatActivity {

    private Adaptador_ViewPagerPrincipal Adaptador_ViewPagerPrincipal;
    private android.support.v4.view.ViewPager ViewPager;
    ImageButton CargarImagen;

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_principal);

        agregarToolbar();

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        setContentView(R.layout.content_actividad_principal);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.TabLayoutPrincipal);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);

        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());
        // Iniciamos el viewPager.
        ViewPager = (ViewPager) findViewById(R.id.ViewPagerPrincipal);

        // Creamos el adaptador, al cual le pasamos por parámtro el gestor de Fragmentos y muy importante, el nº de tabs o secciones que hemos creado.
        Adaptador_ViewPagerPrincipal = new Adaptador_ViewPagerPrincipal(getSupportFragmentManager(), tabLayout.getTabCount());

        // Y los vinculamos.
        ViewPager.setAdapter(Adaptador_ViewPagerPrincipal);
        tabLayout.setupWithViewPager(ViewPager);
    }


    private void agregarToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.ToolbarPrincipal);
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        if (ab != null) {
            // Poner ícono del drawer toggle
            ab.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
            ab.setDisplayHomeAsUpEnabled(true);
        }

    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menudrawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}