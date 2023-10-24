package com.example.basicui2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class BatteryCounter extends AppCompatActivity {

    int total = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery_counter);

        ListView lvCounter = findViewById(R.id.lvCounter);
        TextView tvTotal = findViewById(R.id.tvTotal);

        ArrayList<Battery> bats= new ArrayList<>();

        bats.add(new Battery("AAA",3));
        bats.add(new Battery("Type C",2));
        bats.add(new Battery("Type D",4));
        bats.add(new Battery("AA",5));

        BatteryAdapter list= new BatteryAdapter(this,bats);

        lvCounter.setAdapter(list);

        for(Battery batter: bats){
            total= total + batter.getPoints();
        }


        String s= String.format("Total: \t %s pts.",total);

        tvTotal.setText(s);

    }

    public void exitCounter(View v){
        finish();
    }
}