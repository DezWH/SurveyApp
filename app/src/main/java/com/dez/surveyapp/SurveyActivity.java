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
//https://gist.github.com/minneapolis-edu/e078bb10428a38595b6741c362606655

//https://www.youtube.com/watch?v=LzhNsd9ut_4
public class SurveyActivity extends AppCompatActivity {

    //Buttons

    private Button mYesButton;
    private Button mNoButton;
    TextView question_textview_viewyes;
    TextView question_textview_viewno;

    int yesVotes = 0;
    int noVotes = 0;


    //Wiring up TextView "Yes Button" SurveyActivity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        //Find reference id to yes and no button
        mYesButton = (Button) findViewById(R.id.yes_button);
        mNoButton = (Button) findViewById(R.id.no_button); // find refernce id to no button

        // mQuestionTextView= (TextView) findViewById(R.id.mQuestionTextView);
        // Find reference to TextView, question_textview_viewno and question_textview_viewyes
        question_textview_viewyes = (TextView) findViewById(R.id.question_textview_viewyes);
        question_textview_viewno = (TextView) findViewById(R.id.question_textview_viewno);


        addEventListeners(); //This adds the Eventlistners
    }

    private void addEventListeners() {

        mYesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                yesVotes++; //increment
                question_textview_viewyes.setText("Total YES VOTES: " + yesVotes);

            }
        });
        mNoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                noVotes++; //increment
                question_textview_viewno.setText("Total NO VOTES: " + noVotes);
            }
        });

    }
}


