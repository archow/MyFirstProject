package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

//if you wanted to manually create your own activity:
//ACTIVITY STEP 1: make your activity class extend the AppCompatActivity
//ACTIVITY STEP 2: Create a layout file associated with it
public class ExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ACTIVITY STEP 3: set content view
        setContentView(R.layout.activity_example);
    }
}