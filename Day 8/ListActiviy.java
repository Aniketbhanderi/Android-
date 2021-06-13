package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {
    ListView lv1;
    String name[] = {"OnePlus","Apple","Samsung","Xaomi","Google","Asus"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_list);
        lv1 = findViewById(R.id.lv1);
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(ListActivity.this, android.R.layout.simple_list_item_1,name);

        lv1.setAdapter(arrayAdapter);
        
       lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               Toast.makeText(ListActivity.this, "You have " + name[position] + " Mobile", Toast.LENGTH_SHORT).show();
           }
       });

    }
}
