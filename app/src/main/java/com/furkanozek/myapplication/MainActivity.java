package com.furkanozek.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void save(View view){
        Intent intent = new Intent(MainActivity.this,NewActivity.class);
        startActivity(intent);
    }


    public void youtube(){
        System.out.println("Yagizbrotv kanalına hoş geldiniz!!");
    }


    public void  skrmböleişi(){
        System.out.println("daha kolay bi uygulama yapamadınız mı");
    }

    public void degisiklik(){

    }


}