package com.hllbr.mytestv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView name ;
    SharedPreferences prefs ;
    String firstname ;
    //Hata ayıklama...verinin ikinci activite içerisinde gösterilememesi

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent  = getIntent();

        name = findViewById(R.id.textView);
        prefs = this.getSharedPreferences("com.hllbr.mytestv2", Context.MODE_PRIVATE);
        firstname =prefs.getString("name","No name defined");

        if(firstname.equals("No name defined")){
            name.setText("??");
        }else{
            name.setText("your name "+firstname);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(firstname.equals("No name defined")){
            name.setText("onResume is active");
        }else{
            name.setText("your name "+firstname);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (firstname.equals("No name defined")){
            name.setText("onPause is active");
        }else{
            name.setText("your name 11 "+firstname );
        }
    }

    public void secondScreen(View view){

        if(firstname.equals("No name defined")){
            name.setText("SECOND SCREEN OPENED");
        }else{
            name.setText("your name : "+firstname);
        }

    }
    public void change(View view){
        Intent intent2 = new Intent(MainActivity2.this,MainActivity.class);

        startActivity(intent2);
    }
}