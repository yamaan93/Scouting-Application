package com.example.yamaan.scoutingapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList Match_values =new ArrayList();//Creating arraylist.
    Boolean autoline,highGoal, lowGoal = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onButtonTap(View v){
        // starts new scouting match
        setContentView(R.layout.auto);
    }
    public String readNumber(View v){
        TextView teamNumber;
        teamNumber = (TextView) findViewById(R.id.team_numbers);
        System.out.println(teamNumber.getText().toString());
        return  teamNumber.getText().toString();
    }
    public void autoline(View v){

    }
    public int lowGoal(View v,String direc){
        int count = 0 ;
        direc = v.getTag().toString();
        if(direc == "+"){
            count++;
        }
        else if (direc =="-"){
            count--;
        }
        return count;
    }
    public void highGoal(View v){

    }
    public void testVal (View v){

    }
    public void teleOp(View v){
        // set teleop scouting area

    }
    public void test (View v){
        System.out.println("haha ");
    }

}
