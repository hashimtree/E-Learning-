package com.example.abc.quizapp;

import android.app.Activity;
import android.content.Intent; 
import android.content.Context;
import android.content.SharedPreferences;
	import android.view.View;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;
public class ResultActivity extends Activity {
TextClock textClock;
Button button22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


textClock =  findViewById(R.id.textClock);	      
button22 =	      
findViewById(R.id.button22);	
        TextView resultLabel = (TextView) findViewById(R.id.resultLabel);
        TextView totalScoreLabel = (TextView) findViewById(R.id.totalScoreLabel);
        int score=getIntent().getIntExtra("RIGHT_ANSWER_COUNT",0);

        SharedPreferences settings = getSharedPreferences("Gezira College  of Medical Sciences and Technology  Quiz", Context.MODE_PRIVATE);

        int totalScore = settings.getInt("totalScore",0);
        totalScore+=score;
        resultLabel.setText(score + "/5");
        totalScoreLabel.setText("Total Score :" + totalScore);

        //update the totalScore
        SharedPreferences.Editor editor =settings.edit();
        editor.putInt("totalScore",totalScore);
        editor.commit();



button22.setOnClickListener(new View.OnClickListener() { 
	            @Override 
	            public void onClick(View v) { 	 
	                Intent intent = new Intent(ResultActivity.this,FirstActivity.class); 	                startActivity(intent); 
	                finish(); 
	            } 
	        });


    }
}