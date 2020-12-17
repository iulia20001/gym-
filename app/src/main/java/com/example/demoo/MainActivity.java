package com.example.demoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // Вспомнит код для перехода на другую активность в программе
    public void onClickReg (View view){
        Intent i = new Intent(MainActivity.this, Registration.class);
        startActivity(i);
        finish();
    }

    //findViewById-он по id  возвращается на View
    //getText-возвращает строку
    //toString-предоставляет ясную и достаточную информацию
    //equals-сравнивает содержание объектов
    //и потом вспомнит код для перехода на другую активность в программе
    public void onClickVhod(View v) {
        EditText log = (EditText)findViewById(R.id.log);
        EditText pas = (EditText)findViewById(R.id.pas);

        if(log.getText().toString().equals("serk") && pas.getText().toString().equals("123")){
            Intent o = new Intent(MainActivity.this, Menu.class);
            startActivity(o);
            finish();
        }
        else
        {
            //создает и отображается текстовое уведомления если в equals неправильно ввели пароль или логин
            Toast.makeText(this, "Неправильно введен пароль или логин", Toast.LENGTH_SHORT).show();
        }
    }
}

