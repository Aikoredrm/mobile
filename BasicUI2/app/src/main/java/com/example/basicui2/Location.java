package com.example.basicui2;

public class Location {
    private String address;
    private String distance;

    public Location(String address, String distance){
        this.address= address;
        this.distance= distance;
    }

    public String getAddress() {
        return address;
    }

    public String getDistance() {
        return distance;
    }
}
