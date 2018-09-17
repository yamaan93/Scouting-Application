package com.example.yamaan.scoutingapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    public int lowGoalAutocount =0;
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
    public void lowGoal(View v){
        // ugly setup stuff
        String direc;// find out if plus or minus button was pressed
        direc = v.getTag().toString();//creates a string so you can check
        TextView textView1;// not sure why this is nessesary
        textView1  = (TextView)findViewById(R.id.lowGoalText);// gets textview of lowgoal text
        String number = textView1.getText().toString();// pulls the number in the box incase someone typed in it rather than use the buttons
        int newnumber =  Integer.parseInt(number);
        if( newnumber >= 0){
            lowGoalAutocount = newnumber;
        }

        if(direc.equals("+")){
            lowGoalAutocount++;
            //System.out.println(lowGoalAutocount);
        }
        else if (direc.equals("-") && lowGoalAutocount> -1){
            lowGoalAutocount--;
            //System.out.println(lowGoalAutocount);
        }
        //sets the number in the text box


        textView1.setText(""+lowGoalAutocount);
        System.out.println(lowGoalAutocount);
        //return lowGoalAutocount;
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
