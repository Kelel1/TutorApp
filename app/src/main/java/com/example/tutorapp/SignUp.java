package com.example.tutorapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    EditText firstName = (EditText)findViewById(R.id.firstName);
    EditText lastNeme  = (EditText)findViewById(R.id.lastName);
    EditText email     = (EditText)findViewById(R.id.email);
    EditText phone     = (EditText)findViewById(R.id.number);
    EditText password  = (EditText)findViewById(R.id.password);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void signUp(android.view.View a) {
        return;
    }




}
