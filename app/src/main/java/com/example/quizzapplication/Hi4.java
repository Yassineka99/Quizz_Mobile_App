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

public class Hi4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hi4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button Revolutionary=findViewById(R.id.Revolutionary);
        Button of=findViewById(R.id.of);
        Button American=findViewById(R.id.American);
        Button Mexican=findViewById(R.id.Mexican);
        Button Spanish=findViewById(R.id.Spanish);
        Revolutionary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hi4.this,Hi5.class);
                startActivity(i);
            }
        });
        of.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hi4.this,Hi5.class);
                startActivity(i);
            }
        });
        American.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hi4.this,Hi5.class);
                startActivity(i);
            }
        });
        Mexican.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hi4.this,Hi5.class);
                startActivity(i);
            }
        });
        Spanish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hi4.this,Hi5.class);
                startActivity(i);
            }
        });
    }
}