/*
Chpt. 1
Programmer: Dez Hunter
Date: September 13, 2017
Purpose: Take a Survey of Students Answer
Github: https://github.com/DezWH/SurveyApp.git
 */



package com.dez.surveyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ImageButton;
import android.widget.TextView;
import android.util.Log;
import android.view.Menu;
import java.util.Scanner;


//https://www.youtube.com/watch?v=LzhNsd9ut_4
public class SurveyActivity extends AppCompatActivity {
    //  private static final String =
    //Buttons

    private Button mYesButton;
    private Button mNoButton;
    private TextView mQuestionTextView;
    TextView question_textview_viewyes;
    TextView question_textview_viewno;

    int yesVotes = 0;
    int noVotes = 0 ;
    double y = 1;
    private Button YesButton;

    //Scanner rico = new Scanner(System.in);

    //Wiring up TextView "Yes Button" SurveyActivity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        //Find reference id to yes button
        mYesButton = (Button) findViewById(R.id.yes_button);
        mNoButton = (Button) findViewById(R.id.no_button); // find refernce id to no button

        addEventListeners(); //This adds listners
        //totvotes = rico.nextLine();
        //yesvotes = rico.nextInt();


      if (yesVotes >= 0 + 1) {

        } else {
          System.out.println("yes_button" + yesVotes  + 1);
      }
    }


   /*Configure event listner for all components.*/

    private void addEventListeners() {

        mYesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        mNoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}
