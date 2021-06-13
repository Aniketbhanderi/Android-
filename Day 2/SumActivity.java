package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SumActivity extends AppCompatActivity {
EditText etnum1,etnum2;
TextView tvans;
Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        etnum1 = findViewById(R.id.etnum1);
        etnum2 = findViewById(R.id.etnum2);
        tvans = findViewById(R.id.tvans);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 , n2;
                n1 = etnum1.getText().toString();
                n2 = etnum2.getText().toString();
                int num1 = Integer.parseInt(n1);
                int num2 = Integer.parseInt(n2);

                int sum = num1 + num2;

                tvans.setText("Answer is "+sum);


            }
        });
    }
}
