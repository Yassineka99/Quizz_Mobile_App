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

public class Hi3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hi3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button Egyptians=findViewById(R.id.Egyptians);
        Button Greeks=findViewById(R.id.Greeks);
        Button Romans=findViewById(R.id.Romans);
        Button Babylonians=findViewById(R.id.Babylonians);
        Button Mayans=findViewById(R.id.Mayans);
        Egyptians.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hi3.this,Hi4.class);
                startActivity(i);
            }
        });
        Greeks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hi3.this,Hi4.class);
                startActivity(i);
            }
        });
        Romans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hi3.this,Hi4.class);
                startActivity(i);
            }
        });
        Babylonians.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hi3.this,Hi4.class);
                startActivity(i);
            }
        });
        Mayans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hi3.this,Hi4.class);
                startActivity(i);
            }
        });
    }
}