package com.hfad.aplic_gb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText textDescription, textPerson, phone, number, password,
           email, data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        textDescription = findViewById(R.id.Input);
        textPerson = findViewById(R.id.InputPersonName);
        phone = findViewById(R.id.InputPhone);
        number = findViewById(R.id.InputNumber);
        password = findViewById(R.id.InputPassword);
        email = findViewById(R.id.InputEmail);
        data = findViewById(R.id.InputData);
    }
}