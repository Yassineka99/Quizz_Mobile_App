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

public class Sc3 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sc3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent i2=getIntent();
        int sss = i2.getIntExtra("score",0);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button Hydrogen=findViewById(R.id.Hydrogen);
        Button Oxygen=findViewById(R.id.Oxygen);
        Button Carbon=findViewById(R.id.Carbon);
        Button Nitrogen=findViewById(R.id.Nitrogen);
        Button Methane=findViewById(R.id.Methane);
        Methane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sc3.this,Sc4.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        Oxygen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sc3.this,Sc4.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        Carbon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sc3.this,Sc4.class);
                int ss=sss+1;
                i.putExtra("score",ss);
                startActivity(i);
            }
        });
        Hydrogen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sc3.this,Sc4.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        Nitrogen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sc3.this,Sc4.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
    }
}