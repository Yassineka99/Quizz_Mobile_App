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

public class IT4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_it4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent i2=getIntent();
        int sss = i2.getIntExtra("score",0);
        Button Docker=findViewById(R.id.Docker);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button Studio=findViewById(R.id.Studio);
        Button MySQL=findViewById(R.id.MySQL);
        Button Git=findViewById(R.id.Git);
        Button Linux=findViewById(R.id.Linux);
        MySQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT4.this,IT5.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        Studio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT4.this,IT5.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        Docker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT4.this,IT5.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        Linux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT4.this,IT5.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        Git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT4.this,IT5.class);
                int ss=sss+1;
                i.putExtra("score",ss);
                startActivity(i);
            }
        });
    }
}