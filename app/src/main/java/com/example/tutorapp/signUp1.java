package com.example.tutorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.auth.FirebaseAuth;


public class signUp1 extends AppCompatActivity {

    EditText firstName = (EditText)findViewById(R.id.firstName);
    EditText lastNeme  = (EditText)findViewById(R.id.lastName);
    EditText email     = (EditText)findViewById(R.id.email);
    EditText phone     = (EditText)findViewById(R.id.number);
    EditText password  = (EditText)findViewById(R.id.password);
    Button   signUp    = (Button)findViewById(R.id.signUp);

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up1);




    }

}
