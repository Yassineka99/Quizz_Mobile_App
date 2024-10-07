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

public class know4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_know4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button Vietnam=findViewById(R.id.Vietnam);
        Button Thailand=findViewById(R.id.Thailand);
        Button Japan=findViewById(R.id.Japan);
        Button South=findViewById(R.id.South);
        Button China=findViewById(R.id.China);
        China.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know4.this,know5.class);
                startActivity(i);
            }
        });
        Vietnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know4.this,know5.class);
                startActivity(i);
            }
        });
        Thailand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know4.this,know5.class);
                startActivity(i);
            }
        });
        Japan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know4.this,know5.class);
                startActivity(i);
            }
        });
        South.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know4.this,know5.class);
                startActivity(i);
            }
        });
    }
}