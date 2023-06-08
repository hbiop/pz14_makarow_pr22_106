package com.example.pz14_makarow_pr_22_106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class exercises extends AppCompatActivity implements View.OnClickListener {
    ImageButton menu;
    ImageView exercise;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);
        menu = (ImageButton)findViewById(R.id.imageButton2);
        menu.setOnClickListener(this);
        exercise = (ImageView) findViewById(R.id.imageView13);
        exercise.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.imageButton2:
                intent = new Intent(this, menuu.class);
                startActivity(intent);
                break;
            case R.id.imageView13:
                intent = new Intent(this, video.class);
                startActivity(intent);
                break;
        }
    }
}