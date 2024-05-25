package com.akhiltech.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignIn_Activity extends AppCompatActivity {

    Button btnSignIn;

        TextView tvCreate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        getSupportActionBar().setTitle("SigIn");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvCreate = findViewById(R.id.tvhaveAccount);
        btnSignIn = findViewById(R.id.btnSignUp);

        tvCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn_Activity.this , SignUp_Activity.class);
                startActivity(intent);
            }

        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn_Activity.this , MainActivity2.class);
                startActivity(intent);
            }

        });



    }
}