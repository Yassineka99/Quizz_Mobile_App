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

public class Hi1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hi1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button George=findViewById(R.id.George);
        Button John=findViewById(R.id.John);
        Button Abraham=findViewById(R.id.Abraham);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button Benjamin=findViewById(R.id.Benjamin);
        Button Thomas=findViewById(R.id.Thomas);
        Abraham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hi1.this,Hi2.class);
                startActivity(i);
            }
        });
        John.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hi1.this,Hi2.class);
                startActivity(i);
            }
        });
        George.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hi1.this,Hi2.class);
                startActivity(i);
            }
        });
        Benjamin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hi1.this,Hi2.class);
                startActivity(i);
            }
        });
        Thomas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hi1.this,Hi2.class);
                startActivity(i);
            }
        });
    }
}