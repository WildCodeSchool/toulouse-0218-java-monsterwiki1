package fr.wcs.monsterwiki;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.action_setting);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ListView listTrip = findViewById(R.id.list_monster);
        ArrayList<MonsterModel> results = new ArrayList<>();


        results.add(new MonsterModel("Tyrannoking",R.drawable.darktyrannoking_1, R.drawable.bte_dark));
        results.add(new MonsterModel("Fire Lion",R.drawable.fire_lion_1fire, R.drawable.bte_fire));
        results.add(new MonsterModel("Panda",R.drawable.naturepanda_1, R.drawable.bte_nature));
        results.add(new MonsterModel("Rockila",R.drawable.earthrockilla_1, R.drawable.bte_earth));
        results.add(new MonsterModel("Thunder Eagle", R.drawable.thunderthunder_eagle_1,R.drawable.bte_thunder));
        results.add(new MonsterModel("Sealion",R.drawable.watersealion_1, R.drawable.bte_water,R.drawable.bte_fire));
        results.add(new MonsterModel("Djinn",R.drawable.magicdjinn_1, R.drawable.bte_magic, R.drawable.bte_fire));
        results.add(new MonsterModel("Scorchpeg",R.drawable.lightscorchpeg_1, R.drawable.bte_light, R.drawable.bte_fire));
        results.add(new MonsterModel("Vadamagma",R.drawable.legendvadamagma_1, R.drawable.bte_legend, R.drawable.bte_fire));
        results.add(new MonsterModel("Gravoid", R.drawable.metalgravoid_1,R.drawable.bte_metal, R.drawable.bte_earth));

        // récupérer la valeur de l'extra Type

        // créer un nouvel ArrayList vide

        // faire une boucle qui parcours tous les éléments de results

        // si l'élément à le même type que celui de l'intent, l'ajouter à la nouvelle ArrayList

        // charger l'adapter avec la nouvelle ArrayList plutôt que results


      /*  results.add(new MonsterModel("ugrehhd",14,65,2));
        results.add(new MonsterModel("ugeghd",1,8,2));*/


        MonsterAdapter adapter = new MonsterAdapter(this, results);
        listTrip.setAdapter(adapter);
        ListView listv = findViewById(R.id.list_monster);

        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                Intent intent = new Intent(MainActivity.this, MonsterActivity.class);

                switch (i){

                    case 0:
                        String name= "Tyrannoking";
                        intent.putExtra("extraname",name);
                        break;
                    case 1:
                        name= "Fire Lion";
                        intent.putExtra("extraname",name);


                        break;
                    case 2:
                        name= "Panda";
                        intent.putExtra("extraname",name);
                        break;
                    case 3:
                        name= "Rockila";
                        intent.putExtra("extraname",name);
                        break;
                    case 4:
                        name= "Thunder Eagle";
                        intent.putExtra("extraname",name);
                        break;
                    case 5:
                        name= "Sealion";
                        intent.putExtra("extraname",name);
                        break;
                    case 6:
                        name= "Djinn";
                        intent.putExtra("extraname",name);
                        break;
                    case 7:
                        name= "Scorchpeg";
                        intent.putExtra("extraname",name);
                        break;
                    case 8:
                        name= "Vadamagma";
                        intent.putExtra("extraname",name);
                        break;
                    case 9:
                        name= "Gravoid";
                        intent.putExtra("extraname",name);
                        break;

                }
                startActivity(intent);
            }
        });

        /*TextView monster = findViewById(R.id.textView_name);
        String name = monster.getText().toString();*/



            }




    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_setting) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_bte_dark) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);






        // [...]
        return true;
    }

}


