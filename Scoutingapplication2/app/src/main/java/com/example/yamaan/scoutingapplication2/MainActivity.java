package com.example.yamaan.scoutingapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import gson.*;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    public int team;
    public int match;
    public boolean autoline = false;
    public int lowGoalAutocount =0;
    public int HighGoalAutocount =0;
    public int lowgoal =0;
    public int highgoal = 0;
    public int vault = 0;
    public boolean climb = false;
    public boolean park = false;



    ArrayList Match_values =new ArrayList();//Creating arraylist.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onButtonTap(View v){
        // starts new scouting match
        setContentView(R.layout.auto);

    }
    public void readNumber(View v){
        TextView teamNumber;
        teamNumber = (TextView) findViewById(R.id.team_numbers);
        String numbeerr = teamNumber.getText().toString();
        team = Integer.parseInt(numbeerr);
    }
    public void autoline(View v){
        autoline = !autoline;
    }
    public void match(View v){
        TextView textView1 = (TextView)findViewById(R.id.match);
        String matcher =  textView1.getText().toString();
         match = Integer.parseInt(matcher);

    }
    public void lowGoal(View v){
        // ugly setup stuff
        String direc;// find out if plus or minus button was pressed
        direc = v.getTag().toString();//creates a string so you can check
        TextView textView1  = (TextView)findViewById(R.id.lowGoalText);// gets textview of lowgoal text
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

    }
    public void highGoal(View v){
        // ugly setup stuff
        String direc;// find out if plus or minus button was pressed
        direc = v.getTag().toString();//creates a string so you can check
        TextView textView1  = (TextView)findViewById(R.id.HighGoalText);// gets textview of lowgoal text
        String number = textView1.getText().toString();// pulls the number in the box incase someone typed in it rather than use the buttons
        int newnumber =  Integer.parseInt(number);
        if( newnumber >= 0){
            HighGoalAutocount = newnumber;
        }

        if(direc.equals("+")){
            HighGoalAutocount++;
            //System.out.println(lowGoalAutocount);
        }
        else if (direc.equals("-") && HighGoalAutocount> -1){
            HighGoalAutocount--;
            //System.out.println(lowGoalAutocount);
        }
        //sets the number in the text box


        textView1.setText(""+HighGoalAutocount);
        System.out.println(HighGoalAutocount);

    }

    public void teleOp(View v){
        readNumber(v);
        match(v);
        setContentView(R.layout.telop);

    }
    public void vault(View v){
        // ugly setup stuff
        String direc;// find out if plus or minus button was pressed
        direc = v.getTag().toString();//creates a string so you can check
        TextView textView1  = (TextView)findViewById(R.id.vault);// gets textview of lowgoal text
        String number = textView1.getText().toString();// pulls the number in the box incase someone typed in it rather than use the buttons
        int newnumber =  Integer.parseInt(number);
        if( newnumber >= 0){
            vault = newnumber;
        }

        if(direc.equals("+")){
           vault++;
            //System.out.println(lowGoalAutocount);
        }
        else if (direc.equals("-") && vault> -1){
            vault--;
            //System.out.println(lowGoalAutocount);
        }
        //sets the number in the text box


        textView1.setText(""+vault);
        System.out.println(vault);

    }
    public void lowGoalT(View v){
        // ugly setup stuff
        String direc;// find out if plus or minus button was pressed
        direc = v.getTag().toString();//creates a string so you can check
        TextView textView1  = (TextView)findViewById(R.id.lowGoalText2);// gets textview of lowgoal text
        String number = textView1.getText().toString();// pulls the number in the box incase someone typed in it rather than use the buttons
        int newnumber =  Integer.parseInt(number);
        if( newnumber >= 0){
            lowgoal = newnumber;
        }

        if(direc.equals("+")){
           lowgoal++;
            //System.out.println(lowGoalAutocount);
        }
        else if (direc.equals("-") && lowgoal> -1){
            lowgoal--;
            //System.out.println(lowGoalAutocount);
        }
        //sets the number in the text box


        textView1.setText(""+lowgoal);
        System.out.println(lowgoal);

    }
    public void highGoalT(View v){
        // ugly setup stuff
        String direc = v.getTag().toString();//creates a string so you can check direction
        TextView textView1  = (TextView)findViewById(R.id.HighGoalText2);// gets textview of lowgoal text
        String number = textView1.getText().toString();// pulls the number in the box incase someone typed in it rather than use the buttons
        int newnumber =  Integer.parseInt(number);
        if( newnumber >= 0){
            highgoal = newnumber;
        }

        if(direc.equals("+")){
            highgoal++;
            //System.out.println(lowGoalAutocount);
        }
        else if (direc.equals("-") && lowgoal> -1){
            highgoal--;
            //System.out.println(lowGoalAutocount);
        }
        //sets the number in the text box


        textView1.setText(""+highgoal);
        System.out.println(highgoal);

    }
    public void climb(View v){
        if(v.getTag().toString().equals("+")){
            climb = true;
        }
        else if( v.getTag().toString().equals("-")){
            park = true;
        }
    }
    public void submit(){

    }

    public void test(View v){
     System.out.println(team);
     System.out.println(match);
     System.out.println(autoline);
     System.out.println(lowGoalAutocount);
     System.out.println(HighGoalAutocount);
     System.out.println(highgoal);
     System.out.println(lowgoal);
     System.out.println(vault);
     System.out.println(park);
     System.out.println(climb);

    }

}
