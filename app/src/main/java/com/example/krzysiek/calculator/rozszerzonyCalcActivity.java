package com.example.krzysiek.calculator;

import android.annotation.SuppressLint;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.krzysiek.calculator.databinding.ActivityProstyCalcBinding;

import java.text.DecimalFormat;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class rozszerzonyCalcActivity extends AppCompatActivity {

    public float var1,var2;
    public boolean addVar,subVar,divVar,mulVar,powVar,sqrtVar,silniaVar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rozszerzony_calc);

        Button button0 =  findViewById(R.id.button0);
        Button button1 =  findViewById(R.id.button1);
        Button button2 =  findViewById(R.id.button2);
        Button button3 =  findViewById(R.id.button3);
        Button button4 =  findViewById(R.id.button4);
        Button button5 =  findViewById(R.id.button5);
        Button button6 =  findViewById(R.id.button6);
        Button button7 =  findViewById(R.id.button7);
        Button button8 =  findViewById(R.id.button8);
        Button button9 =  findViewById(R.id.button9);
        Button buttonPlus =  findViewById(R.id.buttonPlus);
        Button buttonMinus =  findViewById(R.id.buttonMinus);
        Button buttonDzielenie =  findViewById(R.id.buttonDzielenie);
        Button buttonMnozenie =  findViewById(R.id.buttonMnozenie);
        Button buttonRowne =  findViewById(R.id.buttonRowne);
        Button buttonC =  findViewById(R.id.buttonC);
        Button buttonDot =  findViewById(R.id.buttonDot);
        Button buttonPow =  findViewById(R.id.buttonPow);
        Button buttonSQRT =  findViewById(R.id.buttonSqrt);
        Button buttonSilnia =  findViewById(R.id.buttonSilnia);
        final EditText editText = findViewById(R.id.editText2);



        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "9");
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + ".");
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(null);
                var1=0;
                var2=0;
            }
        });


        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null){
                    editText.setText("");
                }else {
                    var1 = Float.parseFloat(editText.getText() + "");
                    addVar = true;
                    editText.setText(null);
                }
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null){
                    editText.setText("");
                }else {
                    var1 = Float.parseFloat(editText.getText() + "");
                    subVar = true;
                    editText.setText(null);
                }
            }
        });
        buttonDzielenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null){
                    editText.setText("");
                }else {
                    var1 = Float.parseFloat(editText.getText() + "");
                    divVar = true;
                    editText.setText(null);
                }
            }
        });
        buttonMnozenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null){
                    editText.setText("");
                }else {
                    var1 = Float.parseFloat(editText.getText() + "");
                    mulVar = true;
                    editText.setText(null);
                }
            }
        });
        buttonPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null){
                    editText.setText("");
                }else {
                    var1 = Float.parseFloat(editText.getText() + "");
                    powVar = true;
                    editText.setText(null);
                }
            }
        });
        buttonSQRT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null){
                    editText.setText("");
                }else {
                    var1 = Float.parseFloat(editText.getText() + "");
                    editText.setText(sqrt(var1) +"");
                }
            }
        });
        buttonSilnia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null){
                    editText.setText("");
                }else {
                    var1 = Float.parseFloat(editText.getText() + "");
                    int wynik=1;
                    for(int i=Math.round(var1);i>1;i--){
                        wynik*= i;
                    }
                    editText.setText(wynik +"");
                }
            }
        });

        buttonRowne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    var2 = Float.parseFloat(editText.getText() + "");

                if (addVar){

                    editText.setText(var1 + var2 +"");
                    addVar=false;
                }


                if (subVar){

                    editText.setText(var1 - var2 +"");
                    subVar=false;
                }

                if (mulVar){

                    editText.setText(var1 * var2 +"");
                    mulVar=false;
                }
                if (powVar){

                    editText.setText(pow(var1,var2) +"");
                    powVar=false;
                }

                if (divVar){
                    if(var2==0){
                        editText.setText(R.string.divByZeroError);
                        divVar = false;
                    }else {
                        editText.setText(var1 / var2 + "");
                        divVar = false;
                    }
                }
                var1=0;
                var2=0;
            }
        });



    }
}
