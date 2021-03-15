package com.hllbr.mytestv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nameText ;
    String name ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = "";

        nameText = findViewById(R.id.nameText);


    }
    public void change(View view){
        name = nameText.getText().toString();

        Intent intent =new Intent(MainActivity.this,MainActivity2.class);

        intent.putExtra("name",name);

        startActivity(intent);

    }
}