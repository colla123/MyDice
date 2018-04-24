package com.example.android.mydice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button) findViewById(R.id.rollButton);
        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        final int[] dicearray  = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d("Dicee", "The Button has been pressed");
                //  Toast.makeText(view.getContext(), "The TextView has been touched", Toast.LENGTH_SHORT).show();

                //Random randomNumberGeneratorFirstDice = new Random();
                //Random randomNumberGeneratorSecondDice = new Random();

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(6);
                //int secondDice = randomNumberGeneratorSecondDice.nextInt(6);

                Log.d("Dicee", "The Random Number is: " + number);

                leftDice.setImageResource(dicearray[number]);
                number = randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(dicearray[number]);
                //rightDice.setImageResource(dicearray[secondDice]);
            }
        });
    }
}
