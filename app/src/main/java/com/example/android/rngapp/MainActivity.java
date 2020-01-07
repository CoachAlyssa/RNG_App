package com.example.android.rngapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] numbers = new String[]{"1","2","3","4","5","6"};
    String[] imgs = new String[]{"one","two","three","four","five","six"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button generateButton = (Button) findViewById(R.id.generate_button);
        //Day 1
        final TextView numberDisplay = (TextView) findViewById(R.id.random_number);
        //Day 2
        //final ImageView imgDisplay = (ImageView) findViewById(R.id.random_image);

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Day 1
                String randStr = selectNumber(numbers);
                numberDisplay.setText(randStr);

                //Day 2
                //String randStr = selectNumber(imgs);
                //int id = getResources().getIdentifier(randStr, "drawable", getPackageName());
                //imgDisplay.setImageResource(id);
            }
        });
    }

    private String selectNumber(String[] arr){
        int index = new Random().nextInt(arr.length);
        String rndString = arr[index];
        return rndString;
    }
}
