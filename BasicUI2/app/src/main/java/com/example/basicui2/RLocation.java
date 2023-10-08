package com.example.basicui2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class RLocation extends AppCompatActivity {

    ListView lvRecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rlocation);

        lvRecycle =findViewById(R.id.lv_r1);

        ArrayList<Location> locs= new ArrayList<>();

        locs.add(new Location("Asia Village\nCalle LO MARCOLETA 167,Quilicura ","12.5km"));
        locs.add(new Location("Inacap Sede Renca,\nBravo de Saravia 2980, Renca, Region\n Metropolitana","8.5 km"));
        locs.add(new Location("Inacap Santiago Centro\nAlmte. Barroso 76, 8340536 Santiago","0,1 km"));
        locs.add(new Location("Inacap Santiago Sur\nAv. Escuela Agricola, 7820091 Macul","5,3 km"));



        LocationsAdapter locList= new LocationsAdapter(this,locs);

        lvRecycle.setAdapter(locList);

    }

    public void addRecyclePoint(View view){
        this.finish();
    }

}