package com.example.app3calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {


    private EditText n1;
    private EditText n2;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Scanner s = new Scanner(System.in);

        String num1 = n1.getText().toString();
        String num2 = n2.getText().toString();


        int valorNum1 = s.nextInt();
        int valorNum2 = s.nextInt();


        public void Suma (View view) {
            int suma = num1 + num2;
            System.out.println(suma);
        }
        public void Resta (View view){
            int resta = num1 - num2;
            System.out.println(resta);

        }
        public void multiplica (View view){
            int multiplicacion = num1 * num2;
            System.out.println(multiplicacion);

        }
        public void divide (View view){
            int division = num1 / num2;
            System.out.println(division);

        }
    }
}