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

public class IT5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_it5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent i2=getIntent();
        int sss = i2.getIntExtra("score",0);
        Button Hyper=findViewById(R.id.Hyper);
        Button HyperTech=findViewById(R.id.HyperTech);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button High=findViewById(R.id.High);
        Button HyperText=findViewById(R.id.HyperText);
        Button Hyperlink=findViewById(R.id.Hyperlink);
        High.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT5.this,Score.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        HyperTech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT5.this,Score.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        Hyper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT5.this,Score.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        Hyperlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT5.this,Score.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        HyperText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IT5.this,Score.class);
                int ss=sss+1;
                i.putExtra("score",ss);
                startActivity(i);
            }
        });
    }
}