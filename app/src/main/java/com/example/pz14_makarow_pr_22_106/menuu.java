package com.example.pz14_makarow_pr_22_106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuu extends AppCompatActivity implements View.OnClickListener {
Button exercises;
Button statistics;
Button help;
Button tip;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuu);
        exercises = (Button) findViewById(R.id.button2);
        exercises.setOnClickListener(this);
        statistics =(Button) findViewById(R.id.button3);
        statistics.setOnClickListener(this);
        help =(Button) findViewById(R.id.button4);
        help.setOnClickListener(this);
        tip =(Button) findViewById(R.id.button5);
        tip.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.button2:
                intent = new Intent(this, exercises.class);
                startActivity(intent);
                break;
            case R.id.button3:
                intent = new Intent(this, statistic.class);
                startActivity(intent);
                break;
            case R.id.button4:
                intent = new Intent(this, tip.class);
                startActivity(intent);
                break;
            case R.id.button5:
                intent = new Intent(this, help.class);
                startActivity(intent);
                break;
        }
    }
}