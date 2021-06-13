package com.hfad.aplic_gb;

/*Создать проект со следующими пользовательскими элементами: TextView, EditText, Button, Switch, CheckBox, ToggleButton.
Для работы использовать LinearLayout. Использовать различные шрифты, цвета, размеры, прочие атрибуты.
2. Создать ещё один макет(если не получается, то проект) с несколькими EditText, где использовать атрибут inputType: text, textPersonName, phone, number,
textPassword, textEmailAddress и другие значения.
3. Добавить в проект элемент CalendarView. 4. * Разобраться, что такое параметр*/

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       // setContentView(R.layout.constraint_layout);
       textView = findViewById(R.id.textViewHeader);
        editText = findViewById(R.id.editTextHeader);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
            }
        });
    }
}