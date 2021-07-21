package com.example.locomotion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
RecyclerView recyclerView;
flightAdapter adapter;

String names[]={"spice jet","indian Airlines"};
String place[]={"delhi to new york 4:00pm IST","kolkata to london 5:00AM IST"};
String charges[]={"Rs 20000","Rs 89000"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView=findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new flightAdapter(names,place,charges,this);
        recyclerView.setAdapter(adapter);

    }
}