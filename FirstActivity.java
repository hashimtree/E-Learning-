package com.example.abc.quizapp;

	import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView; 
	 
	public class FirstActivity extends Activity { 
	 Button button,button2, button3, button4;
	 ImageView imageView;
	 TextView textView1;
	    @Override 
	    protected void onCreate(Bundle savedInstanceState) { 
	        super.onCreate(savedInstanceState); 
	        setContentView(R.layout.activity_first); 	 
	    
	    
	    
    
	    
	    
	    
	        
	Button button2 = findViewById(R.id.button_first1); 	 
	 ImageView imageView= findViewById(R.id.image_view);     
	 
	 TextView text_View1= findViewById(R.id.textview1);     	           
	        Button button = findViewById(R.id.button_first); 	 
	        button.setOnClickListener(new View.OnClickListener() { 
	            @Override 
	            public void onClick(View v) { 	 
	                Intent intent = new Intent(FirstActivity.this,MainActivity1.class); 	                startActivity(intent); 
	                finish(); 
	            } 
	        }); 
	        
button2.setOnClickListener(new View.OnClickListener() { 
	            @Override 
	            public void onClick(View v) { 	 
	                Intent intent = new Intent(FirstActivity.this,SecondActivity.class); 	                startActivity(intent); 
	                finish(); 
	            } 
	        }); 	        
	        
	        
	        
	        
	        
	    } 
	} 
