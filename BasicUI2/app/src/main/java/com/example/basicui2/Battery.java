package com.example.basicui2;


import java.util.ArrayList;

public class Battery {
    private String type;
    private String points;
    private int amount;

    public Battery(String type,int amount){
        this.type = type;
        this.amount=amount;

        if (this.type.equals("AAA")) {this.points=this.amount*15 + " points.";}
        if (this.type.equals("AA")) {this.points=this.amount*25 + " points.";}
        if (this.type.equals("Type C")) {this.points=this.amount*40 + " points.";}
        if (this.type.equals("Type D")) {this.points=this.amount*45 + " points.";}
        if (this.type.equals("Type N")) {this.points=this.amount*30 + " points.";}
        if (this.type.equals("Type F")) {this.points=this.amount*35 + " points.";}

    }
    public String getType(){
        return this.type;
    }

    public String getPoints() {
        return points;
    }
    public int getAmount() { return amount;}

}
