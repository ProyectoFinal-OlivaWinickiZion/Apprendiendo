package com.poryectofinal.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Adaptador_ViewPagerPrincipal Adaptador_ViewPagerPrincipal;
    private ViewPager ViewPager;
    ImageButton CargarImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.ToolbarPrincipal);
        setSupportActionBar(toolbar);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.TabLayoutPrincipal);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);

        int contadorImagen = 0;



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

    public void CursosMensajeria(View Vistazo)
    {

        Intent Destino = new Intent(this , Cursos.class);
        ImageButton ADondeVoy = (ImageButton)Vistazo;
        String QueSoy = ADondeVoy.getTag().toString();
        switch(QueSoy)
        {
            case "m1":
                startActivity(Destino);
                this.finish();
                break;
            case "m2":
                startActivity(Destino);
                this.finish();
                break;
            case "m3":
                startActivity(Destino);
                this.finish();
                break;
            case "s1":
                startActivity(Destino);
                this.finish();
            break;
            case "s2":
                startActivity(Destino);
                this.finish();
                break;
            case "s3":
                startActivity(Destino);
                this.finish();
                break;
        }
    }
}
