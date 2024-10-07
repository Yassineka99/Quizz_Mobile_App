package com.example.quizzapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Login extends AppCompatActivity {
    Button b,b1;
    EditText ed1,ed2;
    DatabaseReference dbref,dbref2 ;
    String Phone,pass,edphone,edpass ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        b=findViewById(R.id.sign);
        b1=findViewById(R.id.conf);
        ed1=findViewById(R.id.editText2);
        ed2=findViewById(R.id.editText);

        dbref = FirebaseDatabase.getInstance().getReference().child("Users");
        dbref2 = FirebaseDatabase.getInstance().getReference().child("Users");
        dbref=dbref.child("phone");
        dbref2=dbref2.child("password");
        dbref2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists())
                {
                    pass=snapshot.getValue().toString();
                }
                else{

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edpass=ed2.getText().toString();
                edphone=ed1.getText().toString();
                dbref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.exists())
                        {
                            Phone=snapshot.getValue().toString();


                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }

                });


                if(edpass.equals(pass)&&edphone.equals(Phone))
                {
                    Toast.makeText(Login.this, "Login confirmed", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Login.this,Quizz1.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(Login.this, "Press again to check", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}