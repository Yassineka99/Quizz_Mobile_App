package com.example.quizzapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class know5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_know5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent i2=getIntent();
        int sss = i2.getIntExtra("score",0);
        Button Diamond=findViewById(R.id.Diamond);
        Button Iron=findViewById(R.id.Iron);
         @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button Titanium=findViewById(R.id.Titanium);
        Button Gold=findViewById(R.id.Gold);
        Button Quartz=findViewById(R.id.Quartz);
        Iron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know5.this,Score.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        Diamond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know5.this,Score.class);
                int ss=sss+1;
                i.putExtra("score",ss);
                startActivity(i);
            }
        });
        Titanium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know5.this,Score.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        Gold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know5.this,Score.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        Quartz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know5.this,Score.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
    }
}