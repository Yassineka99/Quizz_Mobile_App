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

public class know1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_know1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button Ottawa=findViewById(R.id.Ottawa);
        Button Toronto=findViewById(R.id.Toronto);
        Button Vancouver=findViewById(R.id.Vancouver);
        Button Montreal=findViewById(R.id.Montreal);
        Button Quebec=findViewById(R.id.Quebec);
        Ottawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know1.this,know2.class);
                startActivity(i);
            }
        });
        Toronto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know1.this,know2.class);
                startActivity(i);
            }
        });
        Vancouver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know1.this,know2.class);
                startActivity(i);
            }
        });
        Montreal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know1.this,know2.class);
                startActivity(i);
            }
        });
        Quebec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know1.this,know2.class);
                startActivity(i);
            }
        });
    }
}