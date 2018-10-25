package com.example.boban.assignment3_part2;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton buttonBall, buttonMusic, buttonMoon = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonBall = findViewById(R.id.imageBall);
        buttonMusic = findViewById(R.id.imageMusic);
        buttonMoon = findViewById(R.id.imageMoon);

        buttonBall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonBall.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.border));
                buttonMoon.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.transparent_border));
                buttonMusic.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.transparent_border));
            }
        });

        buttonMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonMusic.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.border));
                buttonMoon.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.transparent_border));
                buttonBall.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.transparent_border));
            }
        });

        buttonMoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonMoon.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.border));
                buttonBall.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.transparent_border));
                buttonMusic.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.transparent_border));
            }
        });
    }
}
