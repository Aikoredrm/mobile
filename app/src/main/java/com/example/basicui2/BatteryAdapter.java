package com.example.basicui2;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class BatteryAdapter extends ArrayAdapter<Battery> {
    public BatteryAdapter(Context context, ArrayList<Battery> batteries) {
        super(context,0, batteries);
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

        String type= String.format(battery.getType());
        String qty= Integer.toString(battery.getAmount());
        String pts = String.format("%s pts.",battery.getPoints());

        bat.setText(type);
        quan.setText(qty);
        point.setText(pts);


        return convertView;
    }


}
