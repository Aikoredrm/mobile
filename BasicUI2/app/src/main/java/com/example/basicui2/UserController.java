package com.example.basicui2;

import java.util.ArrayList;

public class UserController {
    private static ArrayList<User> listaUser = new ArrayList<>();

    public static void addClient( String name, String password, boolean isSuperUser){
        User u = new User(name,password,isSuperUser);
        listaUser.add(u);
    }

    public static User findUser(String name, String password){
        for(User u : listaUser){
            if(u.getName().equalsIgnoreCase(name) && u.getPassword().equals(password)){
                return u;
            }
        }
        return null;
    }

    public static ArrayList<User> findAll(){
        return listaUser;
    }

    public static void fill(){

        if(listaUser.size() == 0){
            addClient("John","xxx",false);
            addClient("Jenny","aaa",true);
            addClient("Mary","bbb",false);
        }

    }
}
