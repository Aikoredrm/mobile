package com.example.basicui2;


public class Person {
    private String name;
    private String mail;
    private int id;

    public Person(String name,String mail, int id){
        this.name = name;
        this.mail = mail;
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public String getMail(){
        return this.mail;
    }

    public int getId(){
        return this.id;
    }

}
