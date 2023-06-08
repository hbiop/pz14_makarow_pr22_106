package com.example.pz14_makarow_pr_22_106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class statistic extends AppCompatActivity implements View.OnClickListener {
    ImageButton menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic);
        menu = (ImageButton)findViewById(R.id.imageButton4);
        menu.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.imageButton4:
                Intent intent = new Intent(this, menuu.class);
                startActivity(intent);
                break;
        }
    }
}