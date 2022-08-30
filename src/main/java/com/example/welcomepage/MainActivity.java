package com.example.welcomepage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean passwordShow = false;
    TextView signUp, forgotPassword;
    AppCompatButton signIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signUp = (TextView) findViewById(R.id.signUp);
        forgotPassword = (TextView) findViewById(R.id.forgotPassword);

        final EditText username = findViewById(R.id.userNameBtn);
        final EditText password = findViewById(R.id.passwordBtn);
        final ImageView passwordIcon = findViewById(R.id.passwordIcon);

        final AppCompatButton signIn = findViewById(R.id.signIn);
        final TextView signUp = findViewById(R.id.signUp);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Register.class));
            }
        });
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Quiz.class));
            }
        });

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ForgetPassword.class));
            }
        });


        passwordIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(passwordShow){
                    passwordShow = false;

                    password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    passwordIcon.setImageResource(R.drawable.ic_lock_solid);
                }
                else{
                    passwordShow = true;
                    password.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    passwordIcon.setImageResource(R.drawable.ic_lock_open_solid);
                }
            }
        });

//        signUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), Register.class);
//                startActivity(intent);
//            }
//        });
    }
}