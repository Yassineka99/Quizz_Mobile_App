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

public class IT1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_it1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button Central=findViewById(R.id.Central);
        Button Computer=findViewById(R.id.Computer);
        Button Program=findViewById(R.id.Program);
        Button Core=findViewById(R.id.Core);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button Control=findViewById(R.id.Control);
        Program.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT1.this,IT2.class);
                i.putExtra("score",0);
                startActivity(i);
            }
        });
        Computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT1.this,IT2.class);
                i.putExtra("score",0);
                startActivity(i);
            }
        });
        Central.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT1.this,IT2.class);
                i.putExtra("score",1);
                startActivity(i);
            }
        });
        Core.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT1.this,IT2.class);
                i.putExtra("score",0);
                startActivity(i);
            }
        });
        Control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT1.this,IT2.class);
                i.putExtra("score",0);
                startActivity(i);
            }
        });
    }
}