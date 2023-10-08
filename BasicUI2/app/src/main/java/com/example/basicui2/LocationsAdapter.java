package com.example.basicui2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;


public class LocationsAdapter extends ArrayAdapter<Location> {
    public LocationsAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        Location loc= getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_ritem, parent, false);
        }
        ImageView ivImage= (ImageView) convertView.findViewById(R.id.iv_image_recycle);
        TextView tvLocation= (TextView) convertView.findViewById(R.id.tv_location);
        TextView tvDistance= (TextView) convertView.findViewById(R.id.tv_distance);

        ivImage.setImageResource(R.drawable.ic_recycle_icon);
        tvLocation.setText(loc.getAddress());
        tvDistance.setText(loc.getDistance());

        return convertView;
    }
}
