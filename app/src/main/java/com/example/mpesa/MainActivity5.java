package com.example.mpesa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity5 extends AppCompatActivity {
    EditText etAmount;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Bundle bundle = getIntent().getExtras();
        String phone = bundle.getString("phone");
        etAmount = findViewById(R.id.etPin);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amount = etAmount.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity6.class);
                intent.putExtra("phone", phone);
                intent.putExtra("amount", amount);
                startActivity(intent);
            }
        });
    }
}