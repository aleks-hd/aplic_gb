package com.hfad.aplic_gb;

/*Создать проект со следующими пользовательскими элементами: TextView, EditText, Button, Switch, CheckBox, ToggleButton.
Для работы использовать LinearLayout. Использовать различные шрифты, цвета, размеры, прочие атрибуты. 2. Создать ещё один макет
(если не получается, то проект) с несколькими EditText, где использовать атрибут inputType: text, textPersonName, phone, number,
textPassword, textEmailAddress и другие значения. 3. Добавить в проект элемент CalendarView. 4. * Разобраться, что такое параметр*/

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}