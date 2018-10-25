package com.example.boban.assignment3_part2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TTT extends AppCompatActivity {
    TextView testText1, testText2 = null;
    ImageView testImage1, testImage2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttt);
        testText1 = findViewById(R.id.testText1);
        testText2 = findViewById(R.id.testText2);
        testImage1 = findViewById(R.id.testImage1);
        testImage2 = findViewById(R.id.testImage2);

        Intent intent = getIntent();

        testText1.setText(intent.getStringExtra(MainActivity.P1_NAME));
        testText2.setText(intent.getStringExtra(SecondPlayer.P2_NAME));
        testImage1.setImageResource(getResources().getIdentifier(intent.getStringExtra(MainActivity.P1_IMAGE), "drawable", getPackageName()));
        testImage2.setImageResource(getResources().getIdentifier(intent.getStringExtra(SecondPlayer.P2_IMAGE), "drawable", getPackageName()));

    }
}
