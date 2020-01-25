package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //initiate the TextView,EditText Buttons

    private EditText no1, no2; //to get numbers
    private TextView answer; //to view answer
    private Button add, sustract, multiply,divide;

    double number1,number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no1 = findViewById(R.id.number1_text);
        no2 = findViewById(R.id.number2_text);
        answer = findViewById(R.id.answer_text);



    }

    // Addition
    public void add (View view){

       check();
        double sum = number1+number2;
        answer.setText(String.valueOf(sum));
    }

    // Subtraction
    public void subtraction (View view){

        check();
        double sub = number1-number2;
        answer.setText(String.valueOf(sub));
    }

    // Multiplication
    public void multiplication (View view){

        check();
        double mul = number1*number2;
        answer.setText(String.valueOf(mul));
    }
    // Divide
    public void divide (View view){

        check();
        double div = number1/number2;
        answer.setText(String.valueOf(div));
    }



    public void check(){
        try {

            number1 = Double.parseDouble(no1.getText().toString());
            number2= Double.parseDouble(no2.getText().toString());


        }
        catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this,"Enter Integer Values", Toast.LENGTH_SHORT).show();
        }  //try and catch to make sure the user enter double numbers for text
    }

}
