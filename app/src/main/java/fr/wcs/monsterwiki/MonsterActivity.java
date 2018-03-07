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

        ImageView profil =findViewById(R.id.img_monster);
        ImageView element1 =findViewById(R.id.img_element1);
        ImageView element2 =findViewById(R.id.img_element2);
        TextView statpower =findViewById(R.id.stats_power);
        String power = statpower.getText().toString() ;
        TextView statlife=findViewById(R.id.stats_life);
        String life =statlife.getText().toString() ;
        TextView statstamina=findViewById(R.id.stats_stamina);
        String stamina = statstamina.getText().toString();
        TextView statspeed=findViewById(R.id.stats_power);
        String speed = statspeed.getText().toString();

        Intent intent = getIntent();
        String test = intent.getStringExtra("extraplace");
        if (test.equals("0")){
            Toast.makeText(this, "Monstre 0", Toast.LENGTH_SHORT).show();



        }
        if (test.equals("1")){
            Toast.makeText(this, "Monstre 1", Toast.LENGTH_SHORT).show();

            Drawable drawableProfil1=ContextCompat.getDrawable(this,R.drawable.fire_lion_0fire);
            profil.setImageDrawable(drawableProfil1);


        }

    }
}
