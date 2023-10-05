package com.example.basicui2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    private EditText etName;
    private EditText etPwd;

    private String user;
    private String pwd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName= findViewById(R.id.etSend);
        etPwd= findViewById(R.id.etSend2);


    }

    public void send(View view){
        try {
            user= etName.getText().toString();
            pwd = etPwd.getText().toString();
            if(user.equalsIgnoreCase("John") && pwd.equalsIgnoreCase("xxx")){
                Intent i = new Intent(this, SecondActivity.class);
                this.finish();
                startActivity(i);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }

}