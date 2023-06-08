package com.example.pz14_makarow_pr_22_106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tip extends AppCompatActivity implements View.OnClickListener {
    ImageButton menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);
        menu = (ImageButton)findViewById(R.id.imageButtonmenu);
        menu.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.imageButtonmenu:
                Intent intent = new Intent(this, menuu.class);
                startActivity(intent);
                break;
        }
    }
}