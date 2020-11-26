package com.example.uneti_btvn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
Button btnBack;
int kq;
EditText etA2,etB2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etA2 = findViewById(R.id.etA2);
        etB2 = findViewById(R.id.etB2);
        btnBack = findViewById(R.id.btnBack);

        Intent intent = getIntent();
        int a = intent.getIntExtra("valuteA",0);
        int b = intent.getIntExtra("valuteB",0);
        etA2.setText(a+"");
        etB2.setText(b+"");


         kq = a+b;
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("ketqua",kq);
                setResult(RESULT_OK,intent);
                finish();
            }
        });

    }
}