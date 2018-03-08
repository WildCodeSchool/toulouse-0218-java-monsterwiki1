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
        ImageView element3=findViewById(R.id.img_element3);
        TextView statpower = findViewById(R.id.stats_power);
        TextView statlife = findViewById(R.id.stats_life);
        TextView statstamina = findViewById(R.id.stats_stamina);
        TextView statspeed = findViewById(R.id.stats_speed);
        TextView name = findViewById(R.id.text_monster);


        Intent intent = getIntent();
        String test = intent.getStringExtra("extraname");
        if (test.equals("Tyrannoking")) {
            Toast.makeText(this, "Monstre 0", Toast.LENGTH_SHORT).show();
            Drawable drawableElement3 = ContextCompat.getDrawable(this, R.drawable.bte_dark);
            element3.setImageDrawable(drawableElement3);
            element3.setVisibility(View.VISIBLE);
            element1.setVisibility(View.INVISIBLE);
            element2.setVisibility(View.INVISIBLE);

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


            String power="242";
            statpower.setText(power);
            String life="81";
            statlife.setText(life);
            String speed="192";
            statspeed.setText(speed);
            String stamina="100";
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

            String power="209";
            statpower.setText(power);
            String life="91";
            statlife.setText(life);
            String speed = "220";
            statspeed.setText(speed);
            String stamina="100";
            statstamina.setText(stamina);

        }
        if (test.equals("Rockila")) {

            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.earthrockilla_1);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Thunder Eagle";
            name.setText("Thunder Eagle");
            Drawable drawableElement3 = ContextCompat.getDrawable(this, R.drawable.bte_earth);
            element3.setImageDrawable(drawableElement3);
            element3.setVisibility(View.VISIBLE);
            element1.setVisibility(View.INVISIBLE);
            element2.setVisibility(View.INVISIBLE);

            String power="192";
            statpower.setText(power);
            String life="115";
            statlife.setText(life);
            String speed = "192";
            statspeed.setText(speed);
            String stamina="100";
            statstamina.setText(stamina);


        }
        if (test.equals("Thunder Eagle")) {

            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.thunderthunder_eagle_1);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Thunder Eagle";
            name.setText("Thunder Eagle");
            Drawable drawableElement3 = ContextCompat.getDrawable(this, R.drawable.bte_thunder);
            element3.setImageDrawable(drawableElement3);
            element3.setVisibility(View.VISIBLE);
            element1.setVisibility(View.INVISIBLE);
            element2.setVisibility(View.INVISIBLE);

            String power="192";
            statpower.setText(power);
            String life="81";
            statlife.setText(life);
            String speed = "275";
            statspeed.setText(speed);
            String stamina="100";
            statstamina.setText(stamina);


        }
        if (test.equals("Sealion")) {

            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.watersealion_1);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Sealion";
            name.setText("Sealion");
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_water);
            element1.setImageDrawable(drawableElement1);
            Drawable drawableElement2 = ContextCompat.getDrawable(this, R.drawable.bte_fire);
            element2.setImageDrawable(drawableElement2);

            String power="272";
            statpower.setText(power);
            String life="89";
            statlife.setText(life);
            String speed = "242";
            statspeed.setText(speed);
            String stamina="110";
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
            String power="297";
            statpower.setText(power);
            String life="123";
            statlife.setText(life);
            String speed = "198";
            statspeed.setText(speed);
            String stamina="120";
            statstamina.setText(stamina);
            /*power=297;
            LIFE=123;
            Vitesse=198;
            Stamina=120;
             */
        }
        if (test.equals("Scorchpeg")) {

            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.lightlight_spirit_1);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Scorchpeg";
            name.setText("Scorchpeg");
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_light);
            element1.setImageDrawable(drawableElement1);
            Drawable drawableElement2 = ContextCompat.getDrawable(this, R.drawable.bte_fire);
            element2.setImageDrawable(drawableElement2);
            String power="286";
            statpower.setText(power);
            String life="188";
            statlife.setText(life);
            String speed = "286";
            statspeed.setText(speed);
            String stamina="130";
            statstamina.setText(stamina);
            /*power=286;
            LIFE=118;
            Vitesse=286;
            Stamina=130;
             */
        }
        if (test.equals("Vadamagma")) {

            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.legendarch_knight_1);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Vadamagma";
            name.setText("Vadamagma");
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_legend);
            element1.setImageDrawable(drawableElement1);
            Drawable drawableElement2 = ContextCompat.getDrawable(this, R.drawable.bte_fire);
            element2.setImageDrawable(drawableElement2);
            String power="331";
            statpower.setText(power);
            String life="135";
            statlife.setText(life);
            String speed = "306";
            statspeed.setText(speed);
            String stamina="140";
            statstamina.setText(stamina);
            /*power=331;
            LIFE=135;
            Vitesse=306;
            Stamina=140;
             */
        }
        if (test.equals("Gravoid")) {

            Drawable drawableProfil1 = ContextCompat.getDrawable(this, R.drawable.metalgravoid_1);
            profil.setImageDrawable(drawableProfil1);
            String truename = "Gravoid";
            name.setText("Gravoid");
            Drawable drawableElement1 = ContextCompat.getDrawable(this, R.drawable.bte_metal);
            element1.setImageDrawable(drawableElement1);
            Drawable drawableElement2 = ContextCompat.getDrawable(this, R.drawable.bte_earth);
            element2.setImageDrawable(drawableElement2);
            String power="290";
            statpower.setText(power);
            String life="104";
            statlife.setText(life);
            String speed = "244";
            statspeed.setText(speed);
            String stamina="120";
            statstamina.setText(stamina);
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
