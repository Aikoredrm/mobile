package com.example.basicui2;


public class Battery {
    private String type;
    private int points;
    private int amount;

    public Battery(String type,int amount){
        this.type = type;
        this.amount=amount;

        if (this.type.equals("AAA")) {this.points=this.amount*15 ;}
        if (this.type.equals("AA")) {this.points=this.amount*25 ;}
        if (this.type.equals("Type C")) {this.points=this.amount*40 ;}
        if (this.type.equals("Type D")) {this.points=this.amount*45 ;}
        if (this.type.equals("Type N")) {this.points=this.amount*30 ;}
        if (this.type.equals("Type F")) {this.points=this.amount*35 ;}

    }
    public String getType(){
        return this.type;
    }

    public int getPoints() {
        return points;
    }
    public int getAmount() { return amount;}

}
