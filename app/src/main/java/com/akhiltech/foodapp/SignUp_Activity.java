package com.akhiltech.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUp_Activity extends AppCompatActivity {

    TextView tvhaveAccount;
    Button btnSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().setTitle("Register");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnSignUp = findViewById(R.id.btnSignUp);
        tvhaveAccount = findViewById(R.id.tvhaveAccount);

        tvhaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_Activity.this, SignIn_Activity.class);
                startActivity(intent);
            }
        });


        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_Activity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}