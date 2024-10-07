package com.example.quizzapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class know3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_know3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button Venus=findViewById(R.id.Venus);
        Button Jupiter=findViewById(R.id.Jupiter);
        Button Mars=findViewById(R.id.Mars);
        Button Earth=findViewById(R.id.Earth);
        Button Saturn=findViewById(R.id.Saturn);
        Saturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know3.this,know4.class);
                startActivity(i);
            }
        });
        Venus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know3.this,know4.class);
                startActivity(i);
            }
        });
        Jupiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know3.this,know4.class);
                startActivity(i);
            }
        });
        Mars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know3.this,know4.class);
                startActivity(i);
            }
        });
        Earth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know3.this,know4.class);
                startActivity(i);
            }
        });

    }
}