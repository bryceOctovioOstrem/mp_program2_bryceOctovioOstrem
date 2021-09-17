package com.example.program2cosc4730bryceostrem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Tax =  findViewById(R.id.tip); // button for tax option
        TextView result = (TextView)  findViewById(R.id.textView3);
        Tax.setOnClickListener(new View.OnClickListener() { // code for button that displays
            @Override
            public void onClick(View view) {

                EditText taxNumber = findViewById(R.id.tipInput); // conversion code for tip
                double tnumber =  Double.parseDouble(taxNumber.getText().toString());//get the value from edit text
                result.setText(String.valueOf(Math.round(tnumber))); // code that prints out the desired value
            }
        });
       EditText eNumber = findViewById(R.id.inputNumber); // conversion code for total
        Button round = findViewById(R.id.Round); // button for round option
        round.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText taxNumber = findViewById(R.id.tipInput); // conversion code for tip
                double tnumber =  Double.parseDouble(taxNumber.getText().toString());//get the value from edit text
                EditText totalNumber = findViewById(R.id.inputNumber); // conversion code for tip
                double number =  Double.parseDouble(taxNumber.getText().toString());//get the value from edit text
                result.setText(String.valueOf(Math.round(tnumber + number))); // code that prints out the desired value by adding the trip and ammount
            }
        });
    }


}