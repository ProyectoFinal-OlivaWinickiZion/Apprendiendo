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
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import static com.poryectofinal.proyecto.R.id.text;

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

        while (contadorImagen <= 2) {

            switch (contadorImagen) {
                case (0):
                    // CargarImagen.setImageResource(R.drawable.whatsapp);
                    break;

                case (1):
                    //CargarImagen = (ImageButton) findViewById(R.id.MensajesTexto);
                    // CargarImagen.setImageResource(R.drawable.mensajes);
                    break;
            }

            contadorImagen++;
        }


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


    public void CursosMensajeria(View Vistazo) {
        // Lo que estoy tratando de hacer es que si ninguna aplicacion de mensajeria esta instalada le tire el mensaje

        ImageButton ADondeVoy;
        ADondeVoy = (ImageButton) Vistazo;
        // int Boton = ADondeVoy.getId();
        // ADondeVoy=(ImageButton)findViewById(Boton);

            Intent Destino;
            Destino = new Intent(this, Cursos.class);
            //Aca tendria que haber un bundle o algo que indique a que curso de todos va
            startActivity(Destino);

        //           Toast Mensaje;
          //          Mensaje = Toast.makeText(getApplicationContext(), "Usted no tiene aplicaciones de Mensajeria, le recomendamos estas:", Toast.LENGTH_LONG);
            //        Mensaje.show();
                }
            }
