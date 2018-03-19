package fr.wcs.monsterwiki;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by wilder on 06/03/18.
 */

public class MonsterAdapter extends ArrayAdapter<MonsterModel> {

    public MonsterAdapter(Context context, ArrayList<MonsterModel> trips) {
        super(context, 0, trips);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        MonsterModel monster = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_monster, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.textView_name);
        tvName.setText(monster.getName());

        ImageView imgProfil = convertView.findViewById(R.id.iv_profile);
        Drawable drawableProfil = ContextCompat.getDrawable(getContext(), monster.getProfil());
        imgProfil.setImageDrawable(drawableProfil);

        ImageView imgElement1 = convertView.findViewById(R.id.iv_element1);
        Drawable drawableElement1 = ContextCompat.getDrawable(getContext(), monster.getElement1());
        imgElement1.setImageDrawable(drawableElement1);

        /*si l'element2est appellé alors*/
        ImageView imgElement2 = convertView.findViewById(R.id.iv_element2);
        Drawable drawableElement2 = null;
        if (monster.getElement2() != 0) {
            drawableElement2 = ContextCompat.getDrawable(getContext(), monster.getElement2());
        }
        imgElement2.setImageDrawable(drawableElement2);

        // Return the completed view to render on screen
        return convertView;
    }

}
