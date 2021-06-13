package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CustomListActivity extends AppCompatActivity {
ListView lvName;
int[] image = { R.drawable.kiwi , R.drawable.banana ,R.drawable.pineapple ,R.drawable.orange , R.drawable.mango };
String[] name = { "This is Kiwi","This is Banana","This is Pineapple","This is Orange","This is Mango" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
        lvName = findViewById(R.id.lvName);

        Myadpter myadpter = new Myadpter(image,name,CustomListActivity.this);

        lvName.setAdapter(myadpter);

        lvName.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(CustomListActivity.this , ListDataActivity.class);
                intent.putExtra("I1" , image[position]);
                intent.putExtra("T1", name[position]);
                startActivity(intent);
            }
        });

    }
}

