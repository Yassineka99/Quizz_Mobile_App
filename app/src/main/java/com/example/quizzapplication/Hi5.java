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

public class Hi5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hi5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent i2=getIntent();
        int sss = i2.getIntExtra("score",0);
        Button Augustus=findViewById(R.id.Augustus);
        Button Julius=findViewById(R.id.Julius);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button Marcus=findViewById(R.id.Marcus);
        Button Nero=findViewById(R.id.Nero);
        Button Tiberius=findViewById(R.id.Tiberius);
        Julius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hi5.this,Score.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        Augustus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hi5.this,Score.class);
                int ss=sss+1;
                i.putExtra("score",ss);
                startActivity(i);
            }
        });
        Marcus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hi5.this,Score.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        Tiberius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hi5.this,Score.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        Nero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hi5.this,Score.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
    }
}