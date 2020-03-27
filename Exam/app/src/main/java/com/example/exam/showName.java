package com.example.exam;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class showName extends AppCompatActivity {
    TextView textViewMessege;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        textViewMessege = findViewById(R.id.textViewMessege);

        Bundle extras = getIntent().getExtras();
        String name = extras.getString("NAME");

        String Result = name + " is a great android programmer!";
        textViewMessege.setText(Result);
    }
}
