package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating imageview object and binding xml/java
        final ImageView ballDisplay = (ImageView) findViewById(R.id.ivEightBall);

        //Creating ballArray to reference the 5 images
        final int[] ballArray = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3,
        R.drawable.ball4, R.drawable.ball5};

        //Binding button
        Button myButton = (Button) findViewById(R.id.btnAsk);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Creating rng for array position
                Random rng = new Random();

                //Setting image display
                int num = rng.nextInt(4);
                ballDisplay.setImageResource(ballArray[num]);

            }
        });
    }
}
