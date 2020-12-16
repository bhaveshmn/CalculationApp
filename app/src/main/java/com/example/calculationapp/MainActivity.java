package com.example.calculationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private TextView result;
    private EditText etNum1, etNum2;
    private Button add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etNum1= findViewById(R.id.etNum1);
        etNum2= findViewById(R.id.etNum2);
        add= findViewById(R.id.btn1);
        result= findViewById(R.id.tv1);




         add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etNum1.length()==0)
                {
                    etNum1.setError("Enter N1");
                }

                else if (etNum2.length()==0)
                {
                    etNum2.setError("Enter N2");
                }


                else
                {
                    int number1 = Integer.parseInt(etNum1.getText().toString());
                    int number2 = Integer.parseInt(etNum2.getText().toString());
                        int sum = number1 + number2;
                        result.setText("Answer: " + String.valueOf(sum));
                    }

                }

        });





    }
}