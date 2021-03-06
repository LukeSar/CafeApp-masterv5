package com.example.lukesartori.myapp;
//import adds libraries of pre made code for commonly used functions
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class BreakfastMenu extends AppCompatActivity{   //initialises the breakfast menu screen also uses app compat activity as a sub class from fragment activity with many useful API'S for supporting UI development

    ImageButton BackButton;



    @Override    //allows the compiler to override previously set parent functions
    protected void onCreate(Bundle savedInstanceState) {    //used for starting the activity to start up all the components on the screen by using previously saved
        super.onCreate(savedInstanceState); //runs code that is created in the parent class by acting as a calling method within the activity
        setContentView(R.layout.activity_breakfast);    //pairs the UI with the XML used to create it so it can show the user what has been created


        BackButton = (ImageButton) findViewById(R.id.BackButton);

        BackButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                startActivity(new Intent(BreakfastMenu.this, MainScreen.class));
            }
        });




    }
}

