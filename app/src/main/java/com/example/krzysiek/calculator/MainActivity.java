package com.example.krzysiek.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void prostyCalc(View view) {
        Intent startNewActivity = new Intent(this, prostyCalcActivity.class);
        startActivity(startNewActivity);
    }

    public void rozszerzonyCalc(View view) {
        Intent startNewActivity = new Intent(this, rozszerzonyCalcActivity.class);
        startActivity(startNewActivity);
    }
}
