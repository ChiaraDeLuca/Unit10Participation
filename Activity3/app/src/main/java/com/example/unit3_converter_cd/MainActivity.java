package com.example.unit3_converter_cd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextAmount;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAmount = (EditText) findViewById((R.id.editTextAmount));
        textViewResult = (TextView) findViewById((R.id.textViewResult));

    }
    public void buttonDollarClick(View view) {
        double startMoney = Double.parseDouble(editTextAmount.getText().toString());
        Double convertedMoney = startMoney / .8;
        textViewResult.setText(convertedMoney.toString());
    }

    public void buttonEuroClick(View view) {
        double startMoney = Double.parseDouble(editTextAmount.getText().toString());
        Double convertedMoney = startMoney * .8;
        textViewResult.setText(convertedMoney.toString());
    }
}
