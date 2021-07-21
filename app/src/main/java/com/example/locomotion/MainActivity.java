package com.example.locomotion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ImageView flight;
TextView Flight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flight=findViewById(R.id.flightImage);
        Flight=findViewById(R.id.flightText);
        flight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent previewintent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(previewintent);
            }
        });
Flight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent previewintent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(previewintent);
            }});

    }
}