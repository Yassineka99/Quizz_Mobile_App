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

public class Math4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_math4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent i2=getIntent();
        int sss = i2.getIntExtra("score",0);
        Button A=findViewById(R.id.A);
        Button B=findViewById(R.id.B);
        Button C=findViewById(R.id.C);
        Button D=findViewById(R.id.D);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button E=findViewById(R.id.E);
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Math4.this,Math5.class);
                int ss=sss+1;
                i.putExtra("score",ss);
                startActivity(i);
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Math4.this,Math5.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Math4.this,Math5.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Math4.this,Math5.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Math4.this,Math5.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
    }
}