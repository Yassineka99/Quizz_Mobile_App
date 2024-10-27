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

public class know2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_know2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent i2=getIntent();
        int sss = i2.getIntExtra("score",0);

        Button Jane=findViewById(R.id.Jane);
        Button George=findViewById(R.id.George);
        Button William=findViewById(R.id.William);
        Button Charles=findViewById(R.id.Charles);
        Button Mark=findViewById(R.id.Mark);
        Mark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know2.this,know3.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        Charles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know2.this,know3.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        William.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know2.this,know3.class);
                int ss=sss+1;
                i.putExtra("score",ss);
                startActivity(i);
            }
        });
        George.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know2.this,know3.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });
        Jane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(know2.this,know3.class);
                i.putExtra("score",sss);
                startActivity(i);
            }
        });

    }
}