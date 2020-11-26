package com.example.uneti_btvn;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText etA,etB,etKq;
Button btnGet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etA = findViewById(R.id.etA);
        etB = findViewById(R.id.etB);
        etKq = findViewById(R.id.etKq);
        btnGet = findViewById(R.id.btnGet);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),MainActivity2.class);

                int a= Integer.parseInt(etA.getText().toString());
                int b= Integer.parseInt(etB.getText().toString());
                intent.putExtra("valuteA",a);
                intent.putExtra("valuteB",b);
                startActivityForResult(intent,10);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
       if(requestCode == 10 && resultCode == RESULT_OK)  {
                    int kq = data.getIntExtra("ketqua",0);
                    etKq.setText(kq+"");


        }


    }
}