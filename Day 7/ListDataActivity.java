package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ListDataActivity extends AppCompatActivity {
ImageView iv2;
TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_data);

        iv2 = findViewById(R.id.iv2);
        tv2 = findViewById(R.id.tv2);

        Intent intent = getIntent();
        String name = intent.getStringExtra("T1");
        tv2.setText(name);

        int image = intent.getIntExtra("I1",R.drawable.kiwi);
        iv2.setImageResource(image);

    }
}

Activity_list_data.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".ListDataActivity">
<ImageView
    android:id="@+id/iv2"
    android:layout_width="300dp"
    android:layout_height="300dp"
    android:layout_gravity="center"
    android:src="@drawable/kiwi"
    />
<TextView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="This is demo"
    android:textSize="30dp"
    android:textAlignment="center"
    android:layout_gravity="center"
    android:id="@+id/tv2"
    android:textStyle="bold"
    />
</LinearLayout>
