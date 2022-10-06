package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Global Variables
    int teamA=0;
    int teamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclick3(View view){
        teamA=teamA+3;
        displayForTeamA(teamA);
    }
    public void onclick2(View view){
        teamA=teamA+2;
        displayForTeamA(teamA);    }

    public void oncilckfreethrow(View view){
        teamA=teamA+1;
        displayForTeamA(teamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //Display score for teamB
    public void onclick3B(View view){
        teamB=teamB+3;
        displayForTeamB(teamB);
    }
    public void onclick2B(View view){
        teamB=teamB+2;
        displayForTeamB(teamB);    }

    public void oncilckfreethrowB(View view){
        teamB=teamB+1;
        displayForTeamB(teamB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //Resetting the score board
    public void reset(View view){
         teamA=0;
         displayForTeamA(teamA);
         teamB=0;
         displayForTeamB(teamB);

    }

}