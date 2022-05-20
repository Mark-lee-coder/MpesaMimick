package com.example.mpesa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {
    EditText etPin;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Bundle bundle = getIntent().getExtras();
        String phone = bundle.getString("phone");
        int amount = Integer.parseInt(bundle.getString("amount"));
        etPin = findViewById(R.id.etPin);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pin = etPin.getText().toString();
                if(phone.equals("0720107257") && amount >= 1000 && pin.equals("0000")){
                    Toast.makeText(getApplicationContext(), "Sent Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }

                else
                    {
                    Toast.makeText(getApplicationContext(), "Invalid Details, try again", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                    startActivity(intent);
                }
            }
        });
    }
}