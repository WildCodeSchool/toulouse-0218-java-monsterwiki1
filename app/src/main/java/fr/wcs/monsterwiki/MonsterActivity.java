package fr.wcs.monsterwiki;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MonsterActivity extends AppCompatActivity {
    int mEvolution = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster);

        ImageView imgZoom = findViewById(R.id.img_monster);
        Animation zoomAnimation = AnimationUtils.loadAnimation(MonsterActivity.this, R.anim.zoom);
        imgZoom.startAnimation(zoomAnimation);

        Intent intent = getIntent();
        final String monsterName = intent.getStringExtra("extraname");

        setTitle(monsterName);

        //Bouton retour image sorcier
        ImageView retour = findViewById(R.id.imageView_retour);
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MonsterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        final FloatingActionButton evolutionPrevious = findViewById(R.id.floating_left);
        final FloatingActionButton evolutionNext = findViewById(R.id.floating_right);
        evolutionPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mEvolution == 1) {
                    level0(monsterName);
                    mEvolution--;
                    evolutionPrevious.setVisibility(View.INVISIBLE);

                }

                if (mEvolution == 2) {
                    level1(monsterName);
                    mEvolution--;
                    evolutionNext.setVisibility(View.VISIBLE);
                } else if (mEvolution == 3) {
                    level2(monsterName);
                    mEvolution--;
                    evolutionPrevious.setVisibility(View.VISIBLE);
                }
            }
        });

        evolutionNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mEvolution == 1) {
                    level2(monsterName);
                    mEvolution++;
                    evolutionNext.setVisibility(View.VISIBLE);
                } else if (mEvolution == 0) {
                    level1(monsterName);
                    mEvolution++;
                    evolutionPrevious.setVisibility(View.VISIBLE);
                } else if (mEvolution == 2) {
                    level25(monsterName);
                    mEvolution++;
                    evolutionNext.setVisibility(View.INVISIBLE);
                }
            }
        });

        // init monster stat at level1
        level1(monsterName);
    }

    private void level0(String test) {
        final ImageView profil = findViewById(R.id.img_monster);
        final ImageView element1 = findViewById(R.id.img_element1);
        final ImageView element2 = findViewById(R.id.img_element2);
        final ImageView element3 = findViewById(R.id.img_element3);
        final TextView level = findViewById(R.id.text_level);
        final TextView statpower = findViewById(R.id.stats_power);
        final TextView statlife = findViewById(R.id.stats_life);
        final TextView statstamina = findViewById(R.id.stats_stamina);
        final TextView statspeed = findViewById(R.id.stats_speed);
        final TextView name = findViewById(R.id.text_monster);
        final Drawable[] profil2 = {ContextCompat.getDrawable(MonsterActivity.this, R.drawable.darktyrannoking_0)};
        level.setText("Level 0");

        if (test.equals("Tyrannoking")) {
            profil.setImageDrawable(profil2[0]);
            statlife.setText("50");
            statpower.setText("230");
            statspeed.setText("175");
            statstamina.setText("100");
        }

        if (test.equals("Fire Lion")) {
            profil2[0] = ContextCompat.getDrawable(MonsterActivity.this, R.drawable.fire_lion_0fire);
            profil.setImageDrawable(profil2[0]);

            statlife.setText("220");
            statpower.setText("50");
            statspeed.setText("175");
            statstamina.setText("100");
        }

        if (test.equals("Panda")) {
            profil2[0] = ContextCompat.getDrawable(MonsterActivity.this, R.drawable.naturepanda_0);
            profil.setImageDrawable(profil2[0]);

            statlife.setText("56");
            statpower.setText("190");
            statspeed.setText("200");
            statstamina.setText("100");
        }

        if (test.equals("Rockila")) {
            profil2[0] = ContextCompat.getDrawable(MonsterActivity.this, R.drawable.earthrockilla_0);
            profil.setImageDrawable(profil2[0]);

            statlife.setText("71");
            statpower.setText("175");
            statspeed.setText("175");
            statstamina.setText("100");
        }

        if (test.equals("Thunder Eagle")) {
            profil2[0] = ContextCompat.getDrawable(MonsterActivity.this, R.drawable.thunderthunder_eagle_0);
            profil.setImageDrawable(profil2[0]);

            statlife.setText("50");
            statpower.setText("175");
            statspeed.setText("250");
            statstamina.setText("100");
        }
        if (test.equals("Sealion")) {

            profil2[0] = ContextCompat.getDrawable(MonsterActivity.this, R.drawable.watersealion_0);
            profil.setImageDrawable(profil2[0]);

            statlife.setText("50");
            statpower.setText("225");
            statspeed.setText("200");
            statstamina.setText("110");
        }
        if (test.equals("Djinn")) {
            profil2[0] = ContextCompat.getDrawable(MonsterActivity.this, R.drawable.magicdjinn_0);
            profil.setImageDrawable(profil2[0]);

            statlife.setText("63");
            statpower.setText("220");
            statspeed.setText("155");
            statstamina.setText("120");
        }

        if (test.equals("Scorchpeg")) {
            profil2[0] = ContextCompat.getDrawable(MonsterActivity.this, R.drawable.lightscorchpeg_0);
            profil.setImageDrawable(profil2[0]);

            statlife.setText("56");
            statpower.setText("200");
            statspeed.setText("200");
            statstamina.setText("130");
        }

        if (test.equals("Vadamagma")) {
            profil2[0] = ContextCompat.getDrawable(MonsterActivity.this, R.drawable.legendvadamagma_0);
            profil.setImageDrawable(profil2[0]);

            statlife.setText("56");
            statpower.setText("215");
            statspeed.setText("199");
            statstamina.setText("140");
        }

        if (test.equals("Gravoid")) {
            profil2[0] = ContextCompat.getDrawable(MonsterActivity.this, R.drawable.metalgravoid_0);
            profil.setImageDrawable(profil2[0]);

            statlife.setText("53");
            statpower.setText("220");
            statspeed.setText("185");
            statstamina.setText("120");
        }
    }

    private void level1(String test) {
        final ImageView profil = findViewById(R.id.img_monster);
        final ImageView element1 = findViewById(R.id.img_element1);
        final ImageView element2 = findViewById(R.id.img_element2);
        final ImageView element3 = findViewById(R.id.img_element3);
        final TextView level = findViewById(R.id.text_level);
        final TextView statpower = findViewById(R.id.stats_power);
        final TextView statlife = findViewById(R.id.stats_life);
        final TextView statstamina = findViewById(R.id.stats_stamina);
        final TextView statspeed = findViewById(R.id.stats_speed);
        final TextView name = findViewById(R.id.text_monster);
        level.setText("Level 1");

        if (test.equals("Tyrannoking")) {
            Drawable drawableElement3 = ContextCompat.getDrawable(this, R.drawable.bte_dark);
            element3.setImageDrawable(drawableElement3);
            element3.setVisibility(View.VISIBLE);
            element1.setVisibility(View.INVISIBLE);
            element2.setVisibility(View.INVISIBLE);
            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.darktyrannoking_1);
            profil.setImageDrawable(drawableProfil1);
        }
        if (test.equals("Fire Lion")) {
            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.fire_lion_1fire);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Fire Lion";
            name.setText(truename);
            Drawable drawableElement3 = ContextCompat.getDrawable(this, R.drawable.bte_fire);
            element3.setImageDrawable(drawableElement3);
            element3.setVisibility(View.VISIBLE);
            element1.setVisibility(View.INVISIBLE);
            element2.setVisibility(View.INVISIBLE);

            String power = "242";
            statpower.setText(power);
            String life = "81";
            statlife.setText(life);
            String speed = "192";
            statspeed.setText(speed);
            String stamina = "100";
            statstamina.setText(stamina);
        }
        if (test.equals("Panda")) {
            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.naturepanda_1);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Panda";
            name.setText(truename);
            Drawable drawableElement3 = ContextCompat.getDrawable(this, R.drawable.bte_nature);
            element3.setImageDrawable(drawableElement3);
            element3.setVisibility(View.VISIBLE);
            element1.setVisibility(View.INVISIBLE);
            element2.setVisibility(View.INVISIBLE);

            String power = "209";
            statpower.setText(power);
            String life = "91";
            statlife.setText(life);
            String speed = "220";
            statspeed.setText(speed);
            String stamina = "100";
            statstamina.setText(stamina);
        }
        if (test.equals("Rockila")) {
            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.earthrockilla_1);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Thunder Eagle";
            name.setText(truename);
            Drawable drawableElement3 = ContextCompat.getDrawable(this, R.drawable.bte_earth);
            element3.setImageDrawable(drawableElement3);
            element3.setVisibility(View.VISIBLE);
            element1.setVisibility(View.INVISIBLE);
            element2.setVisibility(View.INVISIBLE);

            String power = "192";
            statpower.setText(power);
            String life = "115";
            statlife.setText(life);
            String speed = "192";
            statspeed.setText(speed);
            String stamina = "100";
            statstamina.setText(stamina);
        }
        if (test.equals("Thunder Eagle")) {
            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.thunderthunder_eagle_1);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Thunder Eagle";
            name.setText(truename);
            Drawable drawableElement3 = ContextCompat.getDrawable(this, R.drawable.bte_thunder);
            element3.setImageDrawable(drawableElement3);
            element3.setVisibility(View.VISIBLE);
            element1.setVisibility(View.INVISIBLE);
            element2.setVisibility(View.INVISIBLE);

            String power = "192";
            statpower.setText(power);
            String life = "81";
            statlife.setText(life);
            String speed = "275";
            statspeed.setText(speed);
            String stamina = "100";
            statstamina.setText(stamina);
        }
        if (test.equals("Sealion")) {
            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.watersealion_1);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Sealion";
            name.setText(truename);
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_water);
            element1.setImageDrawable(drawableElement1);
            Drawable drawableElement2 = ContextCompat.getDrawable(this, R.drawable.bte_fire);
            element2.setImageDrawable(drawableElement2);

            String power = "272";
            statpower.setText(power);
            String life = "89";
            statlife.setText(life);
            String speed = "242";
            statspeed.setText(speed);
            String stamina = "110";
            statstamina.setText(stamina);
        }
        if (test.equals("Djinn")) {
            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.magicdjinn_1);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Djinn";
            name.setText(truename);
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_magic);
            element1.setImageDrawable(drawableElement1);
            Drawable drawableElement2 = ContextCompat.getDrawable(this, R.drawable.bte_fire);
            element2.setImageDrawable(drawableElement2);
            String power = "297";
            statpower.setText(power);
            String life = "123";
            statlife.setText(life);
            String speed = "198";
            statspeed.setText(speed);
            String stamina = "120";
            statstamina.setText(stamina);
        }
        if (test.equals("Scorchpeg")) {
            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.lightscorchpeg_1);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Scorchpeg";
            name.setText(truename);
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_light);
            element1.setImageDrawable(drawableElement1);
            Drawable drawableElement2 = ContextCompat.getDrawable(this, R.drawable.bte_fire);
            element2.setImageDrawable(drawableElement2);
            String power = "286";
            statpower.setText(power);
            String life = "188";
            statlife.setText(life);
            String speed = "286";
            statspeed.setText(speed);
            String stamina = "130";
            statstamina.setText(stamina);
        }
        if (test.equals("Vadamagma")) {
            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.legendvadamagma_1);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Vadamagma";
            name.setText(truename);
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_legend);
            element1.setImageDrawable(drawableElement1);
            Drawable drawableElement2 = ContextCompat.getDrawable(this, R.drawable.bte_fire);
            element2.setImageDrawable(drawableElement2);
            String power = "331";
            statpower.setText(power);
            String life = "135";
            statlife.setText(life);
            String speed = "306";
            statspeed.setText(speed);
            String stamina = "140";
            statstamina.setText(stamina);
        }
        if (test.equals("Gravoid")) {
            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.metalgravoid_1);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Gravoid";
            name.setText(truename);
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_metal);
            element1.setImageDrawable(drawableElement1);
            Drawable drawableElement2 = ContextCompat.getDrawable(this, R.drawable.bte_earth);
            element2.setImageDrawable(drawableElement2);
            String power = "290";
            statpower.setText(power);
            String life = "104";
            statlife.setText(life);
            String speed = "244";
            statspeed.setText(speed);
            String stamina = "120";
            statstamina.setText(stamina);
        }
    }

    private void level2(String test) {
        final ImageView profil = findViewById(R.id.img_monster);
        final ImageView element1 = findViewById(R.id.img_element1);
        final ImageView element2 = findViewById(R.id.img_element2);
        final ImageView element3 = findViewById(R.id.img_element3);
        final TextView level = findViewById(R.id.text_level);
        final TextView statpower = findViewById(R.id.stats_power);
        final TextView statlife = findViewById(R.id.stats_life);
        final TextView statstamina = findViewById(R.id.stats_stamina);
        final TextView statspeed = findViewById(R.id.stats_speed);
        final TextView name = findViewById(R.id.text_monster);
        final Drawable[] profil3 = {ContextCompat.getDrawable(MonsterActivity.this, R.drawable.darktyrannoking_2)};

        level.setText("Level 4");

        if (test.equals("Tyrannoking")) {
            profil3[0] = ContextCompat.getDrawable(MonsterActivity.this, R.drawable.darktyrannoking_2);
            profil.setImageDrawable(profil3[0]);
            statlife.setText("50");
            statpower.setText("230");
            statspeed.setText("175");
            statstamina.setText("100");
        }
        if (test.equals("Fire Lion")) {
            profil3[0] = ContextCompat.getDrawable(MonsterActivity.this, R.drawable.firefire_lion_2);
            profil.setImageDrawable(profil3[0]);
            statlife.setText("93");
            statpower.setText("286");
            statspeed.setText("227");
            statstamina.setText("100");
        }
        if (test.equals("Panda")) {
            profil3[0] = ContextCompat.getDrawable(MonsterActivity.this, R.drawable.naturepanda_2);
            profil.setImageDrawable(profil3[0]);
            statlife.setText("104");
            statpower.setText("247");
            statspeed.setText("260");
            statstamina.setText("100");
        }
        if (test.equals("Rockila")) {
            profil3[0] = ContextCompat.getDrawable(MonsterActivity.this, R.drawable.earthrockilla_2);
            profil.setImageDrawable(profil3[0]);
            statlife.setText("132");
            statpower.setText("227");
            statspeed.setText("227");
            statstamina.setText("100");
        }
        if (test.equals("Thunder Eagle")) {
            profil3[0] = ContextCompat.getDrawable(MonsterActivity.this, R.drawable.thunderthunder_eagle_2);
            profil.setImageDrawable(profil3[0]);
            statlife.setText("93");
            statpower.setText("227");
            statspeed.setText("325");
            statstamina.setText("100");
        }
        if (test.equals("Sealion")) {
            profil3[0] = ContextCompat.getDrawable(MonsterActivity.this, R.drawable.watersealion_2);
            profil.setImageDrawable(profil3[0]);
            statlife.setText("102");
            statpower.setText("322");
            statspeed.setText("286");
            statstamina.setText("110");
        }
        if (test.equals("Djinn")) {
            profil3[0] = ContextCompat.getDrawable(MonsterActivity.this, R.drawable.magicdjinn_2);
            profil.setImageDrawable(profil3[0]);
            statlife.setText("142");
            statpower.setText("351");
            statspeed.setText("244");
            statstamina.setText("120");
        }
        if (test.equals("Scorchpeg")) {
            profil3[0] = ContextCompat.getDrawable(MonsterActivity.this, R.drawable.lightscorchpeg_2);
            profil.setImageDrawable(profil3[0]);
            statlife.setText("136");
            statpower.setText("338");
            statspeed.setText("338");
            statstamina.setText("130");
        }
        if (test.equals("Vadamagma")) {
            profil3[0] = ContextCompat.getDrawable(MonsterActivity.this, R.drawable.legendvadamagma_2);
            profil.setImageDrawable(profil3[0]);
            statlife.setText("155");
            statpower.setText("391");
            statspeed.setText("362");
            statstamina.setText("140");
        }
        if (test.equals("Gravoid")) {
            profil3[0] = ContextCompat.getDrawable(MonsterActivity.this, R.drawable.metalgravoid_2);
            profil.setImageDrawable(profil3[0]);
            statlife.setText("119");
            statpower.setText("343");
            statspeed.setText("299");
            statstamina.setText("120");
        }
    }

    private void level25(String test) {
        final ImageView profil = findViewById(R.id.img_monster);
        final ImageView element1 = findViewById(R.id.img_element1);
        final ImageView element2 = findViewById(R.id.img_element2);
        final ImageView element3 = findViewById(R.id.img_element3);
        final TextView level = findViewById(R.id.text_level);
        final TextView statpower = findViewById(R.id.stats_power);
        final TextView statlife = findViewById(R.id.stats_life);
        final TextView statstamina = findViewById(R.id.stats_stamina);
        final TextView statspeed = findViewById(R.id.stats_speed);
        final TextView name = findViewById(R.id.text_monster);
        final Drawable[] profil25 = {ContextCompat.getDrawable(MonsterActivity.this, R.drawable.tyrannoking_25)};

        level.setText("Level 25");

        if (test.equals("Tyrannoking")) {
            Drawable drawableElement4 = ContextCompat.getDrawable(this, R.drawable.bte_dark);
            element3.setImageDrawable(drawableElement4);
            element3.setVisibility(View.VISIBLE);
            element1.setVisibility(View.INVISIBLE);
            element2.setVisibility(View.INVISIBLE);

            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.tyrannoking_25);
            profil.setImageDrawable(drawableProfil1);
        }
        if (test.equals("Fire Lion")) {
            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.fire_lion_25);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Fire Lion";
            name.setText(truename);
            Drawable drawableElement3 = ContextCompat.getDrawable(this, R.drawable.bte_fire);
            element3.setImageDrawable(drawableElement3);
            element3.setVisibility(View.VISIBLE);
            element1.setVisibility(View.INVISIBLE);
            element2.setVisibility(View.INVISIBLE);

            String power = "770";
            statpower.setText(power);
            String life = "1017";
            statlife.setText(life);
            String speed = "612";
            statspeed.setText(speed);
            String stamina = "100";
            statstamina.setText(stamina);
        }
        if (test.equals("Panda")) {
            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.panda_25);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Panda";
            name.setText(truename);
            Drawable drawableElement3 = ContextCompat.getDrawable(this, R.drawable.bte_nature);
            element3.setImageDrawable(drawableElement3);
            element3.setVisibility(View.VISIBLE);
            element1.setVisibility(View.INVISIBLE);
            element2.setVisibility(View.INVISIBLE);

            String power = "665";
            statpower.setText(power);
            String life = "1139";
            statlife.setText(life);
            String speed = "700";
            statspeed.setText(speed);
            String stamina = "100";
            statstamina.setText(stamina);
        }
        if (test.equals("Rockila")) {
            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.rockilla_25);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Thunder Eagle";
            name.setText(truename);
            Drawable drawableElement3 = ContextCompat.getDrawable(this, R.drawable.bte_earth);
            element3.setImageDrawable(drawableElement3);
            element3.setVisibility(View.VISIBLE);
            element1.setVisibility(View.INVISIBLE);
            element2.setVisibility(View.INVISIBLE);

            String power = "612";
            statpower.setText(power);
            String life = "1444";
            statlife.setText(life);
            String speed = "612";
            statspeed.setText(speed);
            String stamina = "100";
            statstamina.setText(stamina);
        }
        if (test.equals("Thunder Eagle")) {
            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.thunder_eagle_25);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Thunder Eagle";
            name.setText(truename);
            Drawable drawableElement3 = ContextCompat.getDrawable(this, R.drawable.bte_thunder);
            element3.setImageDrawable(drawableElement3);
            element3.setVisibility(View.VISIBLE);
            element1.setVisibility(View.INVISIBLE);
            element2.setVisibility(View.INVISIBLE);

            String power = "612";
            statpower.setText(power);
            String life = "1017";
            statlife.setText(life);
            String speed = "875";
            statspeed.setText(speed);
            String stamina = "100";
            statstamina.setText(stamina);
        }
        if (test.equals("Sealion")) {
            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.sealion_25);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Sealion";
            name.setText(truename);
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_water);
            element1.setImageDrawable(drawableElement1);
            Drawable drawableElement2 = ContextCompat.getDrawable(this, R.drawable.bte_fire);
            element2.setImageDrawable(drawableElement2);

            String power = "868";
            statpower.setText(power);
            String life = "1119";
            statlife.setText(life);
            String speed = "770";
            statspeed.setText(speed);
            String stamina = "110";
            statstamina.setText(stamina);
        }
        if (test.equals("Djinn")) {
            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.djinn_25);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Djinn";
            name.setText(truename);
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_magic);
            element1.setImageDrawable(drawableElement1);
            Drawable drawableElement2 = ContextCompat.getDrawable(this, R.drawable.bte_fire);
            element2.setImageDrawable(drawableElement2);
            String power = "945";
            statpower.setText(power);
            String life = "1546";
            statlife.setText(life);
            String speed = "630";
            statspeed.setText(speed);
            String stamina = "120";
            statstamina.setText(stamina);

        }
        if (test.equals("Scorchpeg")) {
            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.scorchpeg_25);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Scorchpeg";
            name.setText(truename);
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_light);
            element1.setImageDrawable(drawableElement1);
            Drawable drawableElement2 = ContextCompat.getDrawable(this, R.drawable.bte_fire);
            element2.setImageDrawable(drawableElement2);
            String power = "910";
            statpower.setText(power);
            String life = "1485";
            statlife.setText(life);
            String speed = "910";
            statspeed.setText(speed);
            String stamina = "130";
            statstamina.setText(stamina);

        }
        if (test.equals("Vadamagma")) {
            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.vadamagma_25);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Vadamagma";
            name.setText(truename);
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_legend);
            element1.setImageDrawable(drawableElement1);
            Drawable drawableElement2 = ContextCompat.getDrawable(this, R.drawable.bte_fire);
            element2.setImageDrawable(drawableElement2);
            String power = "1053";
            statpower.setText(power);
            String life = "1689";
            statlife.setText(life);
            String speed = "976";
            statspeed.setText(speed);
            String stamina = "140";
            statstamina.setText(stamina);

        }
        if (test.equals("Gravoid")) {
            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.gravoid_25);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Gravoid";
            name.setText(truename);
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_metal);
            element1.setImageDrawable(drawableElement1);
            Drawable drawableElement2 = ContextCompat.getDrawable(this, R.drawable.bte_earth);
            element2.setImageDrawable(drawableElement2);
            String power = "924";
            statpower.setText(power);
            String life = "1302";
            statlife.setText(life);
            String speed = "777";
            statspeed.setText(speed);
            String stamina = "120";
            statstamina.setText(stamina);
        }
    }

}



