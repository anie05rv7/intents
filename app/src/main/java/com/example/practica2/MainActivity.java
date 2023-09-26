package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button B,B1,B2,B3,B4,B5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1 = findViewById(R.id.btn1);
        B2 = findViewById(R.id.btn2);
        B3 = findViewById(R.id.btn3);
        B4 = findViewById(R.id.btn4);
        B5 = findViewById(R.id.btn5);


        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        B4.setOnClickListener(this);
        B5.setOnClickListener(this);


         View.OnClickListener li= new View.OnClickListener()
         {
            @Override
           public void onClick(View v){

            }
         };

        B.setOnClickListener(new View.OnClickListener()
        {
         @Override
         public void onClick (View v){

         }
        });

        B.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


     /*   Button B=(Button) view;
        if ( view.getId()==R.id.btn2){

            B.setText("H");
        }


        if ( view.getId()==R.id.btn3){

            B.setText("o");
        }

        if ( view.getId()==R.id.btn4){

            int x=0;
            String r = Integer.toString(x);
            B.setText(r);
        }*/

        Toast.makeText(this, B1.getText(), Toast.LENGTH_SHORT).show();
    }
}