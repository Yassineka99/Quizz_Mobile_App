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

public class IT2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_it2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button Python=findViewById(R.id.Python);
        Button JavaScript=findViewById(R.id.JavaScript);
        Button Ruby=findViewById(R.id.Ruby);
        Button C=findViewById(R.id.C);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button Swift=findViewById(R.id.Swift);
        Ruby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT2.this,IT3.class);
                startActivity(i);
            }
        });
        JavaScript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT2.this,IT3.class);
                startActivity(i);
            }
        });
        Python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT2.this,IT3.class);
                startActivity(i);
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT2.this,IT3.class);
                startActivity(i);
            }
        });
        Swift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT2.this,IT3.class);
                startActivity(i);
            }
        });
    }
}