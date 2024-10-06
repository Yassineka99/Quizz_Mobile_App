package com.example.quizzapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText name,lastname,phone,password ;
    Button b,b1 ;
    DatabaseReference dbref ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        dbref = FirebaseDatabase.getInstance().getReference().child("Users");
        name=findViewById(R.id.editText3);
        lastname=findViewById(R.id.editText4);
        password=findViewById(R.id.editText);
        phone=findViewById(R.id.editText2);
        b=findViewById(R.id.conf);
        b1=findViewById(R.id.log);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Login.class);
                startActivity(i);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String data1 = name.getText().toString();
                String data2 = lastname.getText().toString();
                String data3 = phone.getText().toString();
                String data4 = password.getText().toString();
                dbref.child("name").setValue(data1);
                dbref.child("lastname").setValue(data2);
                dbref.child("phone").setValue(data3);
                dbref.child("password").setValue(data4);

                Toast.makeText(MainActivity.this, "Signed Successfully", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,Login.class);
                startActivity(i);
            }
        });
    }
}