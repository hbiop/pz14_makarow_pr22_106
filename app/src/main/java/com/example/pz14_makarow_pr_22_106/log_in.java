package com.example.pz14_makarow_pr_22_106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class log_in extends AppCompatActivity implements View.OnClickListener {
Button log_in;
EditText login;
EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        log_in = (Button) findViewById(R.id.button);
        log_in.setOnClickListener(this);
        login = (EditText) findViewById(R.id.editTextTextPersonName);
        password = (EditText) findViewById(R.id.editTextTextPersonName2);
    }

    @Override
    public void onClick(View view) {
        if(login.getText().length() > 0 && password.getText().length()> 0) {
            Intent intent = new Intent(this, exercises.class);
            startActivity(intent);
        }

    }
}