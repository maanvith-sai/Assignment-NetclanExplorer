package com.maanvith.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button refine;
    Button explore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        refine = findViewById(R.id.buttonRefine);
        explore = findViewById(R.id.buttonExplore);

        getWindow().setStatusBarColor(getResources().getColor(R.color.status));



        refine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, refineScreen.class);
                startActivity(i);

            }
        });

        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, exploreScreen.class);
                startActivity(i);

            }
        });
    }
}