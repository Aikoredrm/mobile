package com.example.basicui2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void exit(View v){
        finish();
    }

    public void recyclePoints(View view){
        Intent y= new Intent(this, RLocation.class);
        startActivity(y);
    }

    public void batteryPoints(View view){
        Intent y= new Intent(this, BatteryList.class);
        startActivity(y);
    }

    public void batteryCounter(View view){
        Intent y = new Intent(this, BatteryCounter.class);
        startActivity(y);
    }

    public void pointsSummary(View view){
        Intent y = new Intent(this, PointsSummary.class);
        startActivity(y);
    }

}