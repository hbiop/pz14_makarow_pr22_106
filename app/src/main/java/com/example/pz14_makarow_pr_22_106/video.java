package com.example.pz14_makarow_pr_22_106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class video extends AppCompatActivity implements View.OnClickListener {
    ImageButton menu;
    ImageButton back;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        menu = (ImageButton)findViewById(R.id.imageButton5);
        menu.setOnClickListener((View.OnClickListener) this);
        back = (ImageButton)findViewById(R.id.imageButton6);
        back.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.imageButton5:
                intent = new Intent(this, menuu.class);
                startActivity(intent);
                break;
            case R.id.imageButton6:
                intent = new Intent(this, exercises.class);
                startActivity(intent);
                break;
        }
    }
}