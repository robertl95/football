package com.example.android.football;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulsA = 0;
    int foulsB = 0;
    int outsA = 0;
    int outsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void goalA(View v) {
        scoreTeamA=scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void goalB(View v) {
        scoreTeamB=scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    public void displayFoulsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulsA);
        scoreView.setText(String.valueOf(score));
    }
    public void setFoulsA(View v) {
        foulsA=foulsA + 1;
        displayFoulsTeamA(foulsA);
    }
    public void displayOutsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.outsA);
        scoreView.setText(String.valueOf(score));
    }
    public void setOutsA(View v) {
        outsA=outsA + 1;
        displayOutsTeamA(outsA);
    }
    public void displayFoulsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulsB);
        scoreView.setText(String.valueOf(score));
    }
    public void setFoulsB(View v) {
        foulsB=foulsB + 1;
        displayFoulsTeamB(foulsB);
    }
    public void displayOutsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.outsB);
        scoreView.setText(String.valueOf(score));
    }
    public void setOutsB(View v) {
        outsB=outsB + 1;
        displayOutsTeamB(outsB);
    }
    public void reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulsA = 0;
        foulsB = 0;
        outsA = 0;
        outsB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulsTeamA(foulsA);
        displayFoulsTeamB(foulsB);
        displayOutsTeamA(outsA);
        displayOutsTeamB(outsB);
    }
}