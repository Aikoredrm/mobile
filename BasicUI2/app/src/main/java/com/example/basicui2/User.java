package com.example.basicui2;

public class User {
    private boolean isSuperUser;
    private String name;
    private String password;
    public User(String name,String password, boolean isSuperUser){
        this.name=name;
        this.password=password;
        this.isSuperUser=isSuperUser;
    }

    public String getName(){
        return this.name;
    }
    public String getPassword(){
        return this.password;
    }
    public boolean getIsSuperUser(){
        return this.isSuperUser;
    }
}
