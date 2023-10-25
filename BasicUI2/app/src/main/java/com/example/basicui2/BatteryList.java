package com.example.basicui2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class BatteryList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bat_list);


        ListView lvPoints = findViewById(R.id.lvPoints);

        ArrayList<Battery> bats= new ArrayList<>();

        bats.add(new Battery("AAA",1));
        bats.add(new Battery("Type C",1));
        bats.add(new Battery("Type D",1));
        bats.add(new Battery("AA",1));

        BatteryAdapter list= new BatteryAdapter(this,bats);

        lvPoints.setAdapter(list);
    }

    public void back(View view){
        this.finish();
    }

}