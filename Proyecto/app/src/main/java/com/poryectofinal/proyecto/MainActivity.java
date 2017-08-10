package com.poryectofinal.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.view.KeyEvent;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private Adaptador_ViewPagerPrincipal Adaptador_ViewPagerPrincipal;
    private ViewPager ViewPager;
    ImageButton CargarImagen;
    private DrawerLayout drawerLayout;
    EditText Tec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Pantalla Completa
        // getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Tec = (EditText)findViewById(R.id.buscarTxt);

        agregarToolbar();
        Tec.setInputType(InputType.TYPE_NULL);


        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.ToolbarPrincipal);
        setSupportActionBar(toolbar);

        */
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

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        EditText Buscador = (EditText) findViewById(R.id.buscarTxt);}

    private void agregarToolbar(){
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        if(ab != null)
        {
            ab.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
            ab.setDisplayHomeAsUpEnabled(true);
        }
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_drawer);
        return true;
    }
*/
   @Override
   public void onBackPressed() {
       DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
       if (drawer.isDrawerOpen(GravityCompat.START)) {
           drawer.closeDrawer(GravityCompat.START);
       } else {
           super.onBackPressed();
       }
   }

   /*public void Teclado(){
       Tec.setInputType(InputType.TYPE_CLASS_TEXT);
   }*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;

        }
        return super .onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Intent intent;
        switch (item.getItemId())
        {
            case R.id.quisqui:
                intent = new Intent(this, panelquisqui.class);
                startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void Nav(View vista)
    {

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
