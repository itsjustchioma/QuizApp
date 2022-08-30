package com.example.welcomepage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    TextView signIn;
    AppCompatButton regBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        signIn = (TextView) findViewById(R.id.signIn);
        regBtn = (AppCompatButton) findViewById(R.id.regBtn);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), HomePage.class);
                startActivity(intent);
            }
        });

//        TextView signUp;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_register);
//
//        signUp = (TextView) findViewById(R.id.signUp);
//        signUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), Register.class);
//                startActivity(intent);
//            }
//        });
    }
}