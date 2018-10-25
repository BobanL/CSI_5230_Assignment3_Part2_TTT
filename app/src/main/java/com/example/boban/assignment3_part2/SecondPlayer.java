package com.example.boban.assignment3_part2;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class SecondPlayer extends AppCompatActivity {
    public static final String P2_IMAGE =
            "PLAYER2_IMAGE";
    public static final String P2_NAME =
            "PLAYER2_NAME";

    ImageButton buttonGhost, buttonPumpkin, buttonCar = null;
    EditText textName = null;
    Button next = null;
    String imageName = "ghost";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_player);
        buttonGhost = findViewById(R.id.imageGhost);
        buttonPumpkin = findViewById(R.id.imagePumpkin);
        buttonCar = findViewById(R.id.imageCar);

        textName = findViewById(R.id.textName2);
        next = findViewById(R.id.buttonNext2);

        buttonGhost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonGhost.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.border));
                buttonCar.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.transparent_border));
                buttonPumpkin.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.transparent_border));
                imageName = "ghost";
            }
        });

        buttonPumpkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonPumpkin.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.border));
                buttonCar.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.transparent_border));
                buttonGhost.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.transparent_border));
                imageName = "pumpkin";
            }
        });

        buttonCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonCar.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.border));
                buttonGhost.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.transparent_border));
                buttonPumpkin.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.transparent_border));
                imageName = "car";
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTTT = new Intent(v.getContext(), TTT.class);
                Intent intent2 = getIntent();
                String name1, image1 = null;
                name1 = intent2.getStringExtra(MainActivity.P1_NAME);
                image1 = intent2.getStringExtra(MainActivity.P1_IMAGE);
                intentTTT.putExtra(MainActivity.P1_NAME, name1);
                intentTTT.putExtra(MainActivity.P1_IMAGE, image1);
                intentTTT.putExtra(P2_NAME, textName.getText().toString());
                intentTTT.putExtra(P2_IMAGE, imageName);
                startActivity(intentTTT);
            }
        });
    }
}
