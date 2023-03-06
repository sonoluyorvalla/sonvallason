package com.furkanozek.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void save(){
        System.out.println("sa");
    }

    public void as()
    {
        System.out.println("as");
    }

    public void youtube(){
        System.out.println("Yagizbrotv kanalına hoş geldiniz!!");
    }

    public void  skrmböleişi(){
        System.out.println("daha kolay bi uygulama yapamadınız mı");
    }
}