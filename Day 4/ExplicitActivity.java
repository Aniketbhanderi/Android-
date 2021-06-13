package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExplicitActivity extends AppCompatActivity {
    Button btnClick;
    TextView etName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);

        btnClick = findViewById(R.id.btnClick);
        etName = findViewById(R.id.etName);
        btnClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
String name = etName.getText().toString();

                Intent intent = new Intent(LifecycleActivity.this,DataActivity.class);
                intent.putExtra("Name", name);
                startActivity(intent);


            }
        });
    }
}

