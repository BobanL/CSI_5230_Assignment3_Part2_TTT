package com.example.boban.assignment3_part2;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    public static final String P1_IMAGE =
            "PLAYER1_IMAGE";
    public static final String P1_NAME =
            "PLAYER1_NAME";
    ImageButton buttonBall, buttonMusic, buttonMoon = null;
    EditText textName = null;
    Button next = null;
    String imageName = "ball";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonBall = findViewById(R.id.imageBall);
        buttonMusic = findViewById(R.id.imageMusic);
        buttonMoon = findViewById(R.id.imageMoon);

        textName = findViewById(R.id.textName);
        next = findViewById(R.id.buttonNext1);

        buttonBall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonBall.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.border));
                buttonMoon.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.transparent_border));
                buttonMusic.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.transparent_border));
                imageName = "ball";
            }
        });

        buttonMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonMusic.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.border));
                buttonMoon.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.transparent_border));
                buttonBall.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.transparent_border));
                imageName = "music";
            }
        });

        buttonMoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonMoon.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.border));
                buttonBall.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.transparent_border));
                buttonMusic.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.transparent_border));
                imageName = "moon";
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SecondPlayer.class);
                intent.putExtra(P1_NAME, textName.getText().toString());
                intent.putExtra(P1_IMAGE, imageName);
                startActivity(intent);
            }
        });
    }
}
