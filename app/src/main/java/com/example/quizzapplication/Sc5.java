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

public class Sc5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sc5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button Plasma=findViewById(R.id.Plasma);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button Stem=findViewById(R.id.Stem);
        Button White=findViewById(R.id.White);
        Button Red=findViewById(R.id.Red);
        Button Platelets=findViewById(R.id.Platelets);
        Plasma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sc5.this,Score.class);
                startActivity(i);
            }
        });
        Stem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sc5.this,Score.class);
                startActivity(i);
            }
        });
        White.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sc5.this,Score.class);
                startActivity(i);
            }
        });
        Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sc5.this,Score.class);
                startActivity(i);
            }
        });
        Platelets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sc5.this,Score.class);
                startActivity(i);
            }
        });
    }
}