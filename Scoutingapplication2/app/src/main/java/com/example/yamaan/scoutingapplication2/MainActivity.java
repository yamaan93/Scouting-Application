package com.example.yamaan.scoutingapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList Match_values =new ArrayList();//Creating arraylist.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onButtonTap(View v){
        setContentView(R.layout.auto);
    }
    public void autoline(View v){

    }
}
