package com.example.kbd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Segitiga extends AppCompatActivity {

    Float alas, tinggi, luas, keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segitiga);

        Button btn_LSegitiga = findViewById(R.id.btn_LSegitiga);
        Button btn_KSegitiga = findViewById(R.id.btn_KSegitiga);

        btn_LSegitiga.setOnClickListener(v -> {
            LuasSegitiga(v);
        });

        btn_KSegitiga.setOnClickListener(v -> {
            KelilingSegitiga(v);
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void LuasSegitiga(View view){

        EditText txt_alas = findViewById(R.id.txt_alas);
        EditText txt_tinggi = findViewById(R.id.txt_tinggi);
        EditText txt_Hsegitiga = findViewById(R.id.txt_Hsegitiga);

        alas = Float.parseFloat(txt_alas.getText().toString());
        tinggi = Float.parseFloat(txt_tinggi.getText().toString());
        luas = (alas * tinggi)/2;
        txt_Hsegitiga.setText(luas.toString());

    }

    public void KelilingSegitiga(View view){

        EditText txt_alas = findViewById(R.id.txt_alas);
        EditText txt_tinggi = findViewById(R.id.txt_tinggi);
        EditText txt_Hsegitiga = findViewById(R.id.txt_Hsegitiga);

        alas = Float.parseFloat(txt_alas.getText().toString());
        tinggi = Float.parseFloat(txt_tinggi.getText().toString());
        keliling = alas * 3;
        txt_Hsegitiga.setText(keliling.toString());



    }

}