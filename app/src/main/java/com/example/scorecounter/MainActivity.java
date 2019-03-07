package com.example.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int TeamA=0;
    int TeamB=0;

    //Adds One Points To Team A score
   public void AddOnePointA(View view){
        TeamA+=1;
        displayA(TeamA);
    }

    //Adds Two Points To Team A score
   public  void AddTwoPointA(View view){
        TeamA+=2;
        displayA(TeamA);
    }

    //Adds Three Points To Team A score
   public  void AddThreePointA(View view){
        TeamA+=3;
        displayA(TeamA);
    }

    //Displays The score of the team A
   public  void displayA(int score){
        TextView Team_a_score = (TextView) findViewById(R.id.TeamAScore);
        Team_a_score.setText(String.valueOf(score));

    }


    //Adds One Points To Team B score
   public void AddOnePointB(View view){
        TeamB+=1;
        displayB(TeamB);
    }

    //Adds Two Points To Team B score
    public void AddTwoPointB(View view){
        TeamB+=2;
        displayB(TeamB);
    }

    //Adds Three Points To Team B score
    public void AddThreePointB(View view){
        TeamB+=3;
        displayB(TeamB);
    }

    //Displays The score of the Team B
    public void displayB(int score){
        TextView team_b_score = (TextView) findViewById(R.id.TeamBScore);
        team_b_score.setText(String.valueOf(score));
    }


    //Resets The Score to zero of both the teams
    public void ResetScores(View view){
       TeamA=0;
       TeamB=0;
       displayB(TeamB);
       displayA(TeamA);
    }




}
