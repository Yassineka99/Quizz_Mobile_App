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

public class Sc4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sc4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent i2=getIntent();
        int sss = i2.getIntExtra("score",0);
        Button Tooth=findViewById(R.id.Tooth);
        Button Bone=findViewById(R.id.Bone);
        Button Cartilage=findViewById(R.id.Cartilage);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button Muscle=findViewById(R.id.Muscle);
        Button Keratin=findViewById(R.id.Keratin);
        Keratin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sc4.this,Sc5.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        Cartilage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sc4.this,Sc5.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        Bone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sc4.this,Sc5.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        Tooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sc4.this,Sc5.class);
                int ss=sss+1;
                i.putExtra("score",ss);
                startActivity(i);
            }
        });
        Muscle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sc4.this,Sc5.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
    }
}