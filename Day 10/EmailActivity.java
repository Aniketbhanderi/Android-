package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmailActivity extends AppCompatActivity {

    EditText etTo , etSubject,etMessage;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        etTo = findViewById(R.id.etEmail);
        etSubject = findViewById(R.id.etMssg);
        etMessage = findViewById(R.id.etSub);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            String to = etTo.getText().toString();
            String subject = etSubject   .getText().toString();

            String message =  etMessage.getText().toString();

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra (Intent.EXTRA_EMAIL, new String[]{to});
                 intent.putExtra (Intent.EXTRA_SUBJECT, subject);
                 intent.putExtra (Intent. EXTRA_TEXT, message);

//Add below line to prompt email client only.

                intent.setType ("message/rfc822");
                startActivity (Intent.createChooser (intent,  "Send email :"));

            }
        });

    }
}
