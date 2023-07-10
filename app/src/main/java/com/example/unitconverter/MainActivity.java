package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button btn;
    TextView textBar, textNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextNumber);
        textBar = findViewById(R.id.textView);
        textNumber = findViewById(R.id.textNumber);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(this::onClick);
    }
    public double convertToPounds(double kilo){ // this method does the calculation
        return kilo * 2.20462;
    }

    private void onClick(View v) { // this method creates functionality for the app and updates the value
        double kilosEntered = Double.parseDouble(editText.getText().toString());
        textNumber.setText(convertToPounds(kilosEntered) + " lb");

    }
}