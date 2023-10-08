package com.example.basicui2;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class BatteryAdapter extends ArrayAdapter<Battery> {
    private ArrayList<Battery> bates;
    public BatteryAdapter(Context context, ArrayList<Battery> batteries) {
        super(context,0, batteries);

        this.bates=batteries;

    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {

        Battery battery = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.bat_item, parent, false);
        }

        TextView quan = convertView.findViewById(R.id.tv_cantidad);
        TextView bat = convertView.findViewById(R.id.tv_bateria);
        TextView point = convertView.findViewById(R.id.tv_puntos);

        /*
        HashMap<String,Integer> batter = new HashMap<>();

        for (Battery bata : bates) {
            if (!batter.containsKey(bata.getType())){
                batter.put(bata.getType(), 1);
            }
        }

        System.out.println(batter);

        if (battery.getType().equals("AAA")) {
            int x= batter.get("AAA")+1;
            batter.put("AAA",x);
            quan.setText(batter.get("AAA").toString());
            bat.setText("AAA");
        }
        */

        bat.setText(battery.getType());
        quan.setText(Integer.toString(battery.getAmount()));
        point.setText(battery.getPoints());

        return convertView;
    }


}