package fr.wcs.monsterwiki;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static java.security.AccessController.getContext;

public class MonsterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster);

        ImageView profil = findViewById(R.id.img_monster);
        ImageView element1 = findViewById(R.id.img_element1);
        ImageView element2 = findViewById(R.id.img_element2);
        TextView statpower = findViewById(R.id.stats_power);
        String power = statpower.getText().toString();
        TextView statlife = findViewById(R.id.stats_life);
        String life = statlife.getText().toString();
        TextView statstamina = findViewById(R.id.stats_stamina);
        String stamina = statstamina.getText().toString();
        TextView statspeed = findViewById(R.id.stats_speed);
        String speed = statspeed.getText().toString();

        Intent intent = getIntent();
        String test = intent.getStringExtra("extraplace");
        if (test.equals("0")) {
            Toast.makeText(this, "Monstre 0", Toast.LENGTH_SHORT).show();


        }
        if (test.equals("1")) {

            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.fire_lion_1fire);
            profil.setImageDrawable(drawableProfil1);
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_fire);
            element1.setImageDrawable(drawableElement1);

            /*
            puissance=242;
            life=81,
            vitesse=192,
            stamina=100
            */

        }

        if (test.equals("2")) {

            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.naturepanda_1);
            profil.setImageDrawable(drawableProfil1);
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_nature);
            element1.setImageDrawable(drawableElement1);
            /*power=209;
            LIFE=91;
            Vitesse=220;
            Stamina=100
             */
        }
        if (test.equals("3")) {

            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.earthrockilla_1);
            profil.setImageDrawable(drawableProfil1);
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_earth);
            element1.setImageDrawable(drawableElement1);
            /*power=192;
            LIFE=115;
            Vitesse=192;
            Stamina=100;
             */
        }
        if (test.equals("4")) {

            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.thunderthunder_eagle_1);
            profil.setImageDrawable(drawableProfil1);
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_thunder);
            element1.setImageDrawable(drawableElement1);
            /*power=192;
            LIFE=81;
            Vitesse=275;
            Stamina=100;
             */
        }
        if (test.equals("5")) {

            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.watersealion_1);
            profil.setImageDrawable(drawableProfil1);
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_water);
            element1.setImageDrawable(drawableElement1);
            Drawable drawableElement2 = ContextCompat.getDrawable(this, R.drawable.bte_fire);
            element2.setImageDrawable(drawableElement2);
            /*power=272;
            LIFE=89;
            Vitesse=242;
            Stamina=110;
             */
        }
        if (test.equals("6")) {

            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.magicdjinn_1);
            profil.setImageDrawable(drawableProfil1);
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_magic);
            element1.setImageDrawable(drawableElement1);
            Drawable drawableElement2 = ContextCompat.getDrawable(this, R.drawable.bte_fire);
            element2.setImageDrawable(drawableElement2);
            /*power=297;
            LIFE=123;
            Vitesse=198;
            Stamina=120;
             */
        }
        if (test.equals("7")) {

            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.lightlight_spirit_1);
            profil.setImageDrawable(drawableProfil1);
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_light);
            element1.setImageDrawable(drawableElement1);
            Drawable drawableElement2 = ContextCompat.getDrawable(this, R.drawable.bte_fire);
            element2.setImageDrawable(drawableElement2);
            /*power=286;
            LIFE=118;
            Vitesse=286;
            Stamina=130;
             */
        }
        if (test.equals("8")) {

            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.legendarch_knight_1);
            profil.setImageDrawable(drawableProfil1);
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_legend);
            element1.setImageDrawable(drawableElement1);
            Drawable drawableElement2 = ContextCompat.getDrawable(this, R.drawable.bte_fire);
            element2.setImageDrawable(drawableElement2);
            /*power=331;
            LIFE=135;
            Vitesse=306;
            Stamina=140;
             */
        }
        if (test.equals("9")) {

            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.metalgravoid_1);
            profil.setImageDrawable(drawableProfil1);
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_metal);
            element1.setImageDrawable(drawableElement1);
            Drawable drawableElement2 = ContextCompat.getDrawable(this, R.drawable.bte_earth);
            element2.setImageDrawable(drawableElement2);
            /*power=290;
            LIFE=104;
            Vitesse=244;
            Stamina=120;
            Exemple
            String speed2="654";
            statspeed.setText(speed2);
             */
        }

    }
}
