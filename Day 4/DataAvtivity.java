package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
TextView tvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        tvName.findViewById(R.id.tvName);

        Intent intent = getIntent();
        String nm = intent.getStringExtra("NAME");
        tvName.setText("Welcome"+nm);


    }
}

activity_data.xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".DataActivity"
>

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="This is Data Activity"
        android:textColor="@color/black"
        android:textSize="30sp"
        android:id="@+id/tvName"
        tools:ignore="MissingConstraints" />
</androidx.constraintlayout.widget.ConstraintLayout>
