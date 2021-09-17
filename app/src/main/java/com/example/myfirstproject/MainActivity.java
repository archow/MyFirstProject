package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String MY_FIRST_LOG = "my_first_log";

    //let's go ahead and identify the view elements we'll be using in our code
    //so...how do?
    //outside the activity methods, but inside the class, we'll declare some global View variables
    //(m stands for member variable)
    TextView mHelloTextView;
    Button mExampleButton;
    EditText mExampleEdit;
    ConstraintLayout mExampleLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this line specifies which layout will be associated with this activity
        setContentView(R.layout.activity_main);
        //now initialize the elements here
        mHelloTextView = (TextView) findViewById(R.id.hello_tex_view);
        mExampleButton = (Button) findViewById(R.id.example_button);
        //mExampleEdit = (EditText) findViewById(R.id.example_et);
        mExampleLayout = (ConstraintLayout) findViewById(R.id.example_layout);

        //Log levels can be found in the Logcat window
        //takes two parameters: name/tag & message
        Log.d(MY_FIRST_LOG, "MY APP JUST STARTED");

        //creating edit text programmatically
        //let's come back to this (adding items programmatically)

        mExampleEdit = new EditText(this);
        mExampleEdit.setHint("type here");
        mExampleEdit.setLayoutParams(new ConstraintLayout
                .LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,
                    ConstraintLayout.LayoutParams.WRAP_CONTENT));
        mExampleLayout.addView(mExampleEdit);

        //test


        //let's make our elements interactive
        //how do..
        mHelloTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "Text view was clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        mExampleEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                mExampleButton.setText(s.toString());
            }
        });
    }

    //first (and not recommended) way to make elements interactable
    public void buttonClicked(View view) {
        mHelloTextView.setText("This is changed");
        //Common display item: toast
        //three parameters: Context, message, the lenght of the message time
        Toast.makeText(this, "This is just toast", Toast.LENGTH_LONG).show();
    }
}