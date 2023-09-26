package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {


    Button B;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B = (Button) findViewById(R.id.btn1);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this, MainActivity2.class);
        startActivities(new Intent[]{i});
        //startActivities(new Intent(this, MainActivity2.class));
        
    }


}