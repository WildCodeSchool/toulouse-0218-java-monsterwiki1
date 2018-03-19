package fr.wcs.monsterwiki;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ArrayList<MonsterModel> mMonsterListFiltered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        final ListView listMonster = findViewById(R.id.list_monster);
        ArrayList<MonsterModel> monsterList = new ArrayList<>();


        monsterList.add(new MonsterModel("Tyrannoking", R.drawable.darktyrannoking_1, R.drawable.bte_dark, 0));
        monsterList.add(new MonsterModel("Fire Lion", R.drawable.fire_lion_1fire, R.drawable.bte_fire, 0));
        monsterList.add(new MonsterModel("Panda", R.drawable.naturepanda_1, R.drawable.bte_nature, 0));
        monsterList.add(new MonsterModel("Rockila", R.drawable.earthrockilla_1, R.drawable.bte_earth, 0));
        monsterList.add(new MonsterModel("Thunder Eagle", R.drawable.thunderthunder_eagle_1, R.drawable.bte_thunder, 0));
        monsterList.add(new MonsterModel("Sealion", R.drawable.watersealion_1, R.drawable.bte_water, R.drawable.bte_fire));
        monsterList.add(new MonsterModel("Djinn", R.drawable.magicdjinn_1, R.drawable.bte_magic, R.drawable.bte_fire));
        monsterList.add(new MonsterModel("Scorchpeg", R.drawable.lightscorchpeg_1, R.drawable.bte_light, R.drawable.bte_fire));
        monsterList.add(new MonsterModel("Vadamagma", R.drawable.legendvadamagma_1, R.drawable.bte_legend, R.drawable.bte_fire));
        monsterList.add(new MonsterModel("Gravoid", R.drawable.metalgravoid_1, R.drawable.bte_metal, R.drawable.bte_earth));

        mMonsterListFiltered = monsterList;
        Intent intent = getIntent();
        int element = intent.getIntExtra("element", 0);
        if (element != 0 && element != R.id.item_all) {
            mMonsterListFiltered = getMonsterListFiltered(element, monsterList);
        }

        //ancien code MonsterAdapter adapter = new MonsterAdapter(this, results);
        //on envoit la nouvelle liste a afficher
        final MonsterAdapter adapter = new MonsterAdapter(this, mMonsterListFiltered);
        listMonster.setAdapter(adapter);

        listMonster.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, MonsterActivity.class);
                MonsterModel currentMonster = mMonsterListFiltered.get(i);
                intent.putExtra("extraname", currentMonster.getName());

                startActivity(intent);
            }
        });
    }

    public ArrayList<MonsterModel> getMonsterListFiltered(int element, ArrayList<MonsterModel> monsterList) {
        int drawableId;
        switch (element) {
            case R.id.nav_dark:
                drawableId = R.drawable.bte_dark;
                break;
            case R.id.nav_fire:
                drawableId = R.drawable.bte_fire;
                break;
            case R.id.nav_earth:
                drawableId = R.drawable.bte_earth;
                break;
            case R.id.nav_light:
                drawableId = R.drawable.bte_light;
                break;
            case R.id.nav_water:
                drawableId = R.drawable.bte_water;
                break;
            case R.id.nav_thunder:
                drawableId = R.drawable.bte_thunder;
                break;
            case R.id.nav_magic:
                drawableId = R.drawable.bte_magic;
                break;
            case R.id.nav_nature:
                drawableId = R.drawable.bte_nature;
                break;
            case R.id.nav_legend:
                drawableId = R.drawable.bte_legend;
                break;
            case R.id.nav_metal:
                drawableId = R.drawable.bte_metal;
                break;
            default:
                // cas par défault pour éviter les erreurs
                drawableId = R.drawable.ic_launcher_background;
        }
        ArrayList<MonsterModel> monsterListFiltered = new ArrayList<>();
        for (MonsterModel monsterModel : monsterList) {
            //si l'element *** correspond à***
            if (monsterModel.getElement1() == drawableId
                    || monsterModel.getElement2() == drawableId
                    ) {
                //on le rajoute a la nouvelle liste
                monsterListFiltered.add(monsterModel);
            }
        }
        return monsterListFiltered;
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        // close menu
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        // reload activity
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        intent.putExtra("element", id);
        startActivity(intent);

        return true;
    }

}


