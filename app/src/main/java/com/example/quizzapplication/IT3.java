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

public class IT3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_it3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button temporarily=findViewById(R.id.temporarily);
        Button operating=findViewById(R.id.operating);
        Button input=findViewById(R.id.input);
        Button permanently=findViewById(R.id.permanently);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button system=findViewById(R.id.system);
        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT3.this,IT4.class);
                startActivity(i);
            }
        });
        operating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT3.this,IT4.class);
                startActivity(i);
            }
        });
        temporarily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT3.this,IT4.class);
                startActivity(i);
            }
        });
        permanently.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT3.this,IT4.class);
                startActivity(i);
            }
        });
        system.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT3.this,IT4.class);
                startActivity(i);
            }
        });
    }
}