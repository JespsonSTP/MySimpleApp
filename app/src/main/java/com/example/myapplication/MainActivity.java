package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Pet lil_bro = new Pet(5, 6.9, true);

        //we can change it here as well but we must initialize the instace with the
        //parameters in the constructor
        lil_bro.mAge = 5;
        lil_bro.mWeight = 6.8;
        lil_bro.isCat = true;

        //initializing the second pet with the second constructor
        Pet lil_bro_sis = new Pet();

    }
}