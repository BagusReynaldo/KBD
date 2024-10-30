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

public class Persegi extends AppCompatActivity {

    Float sisi, luas, keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_persegi);

        Button btn_LPersegi = findViewById(R.id.btn_LPersegi);
        Button btn_KPersegi = findViewById(R.id.btn_KPersegi);

        btn_LPersegi.setOnClickListener(v -> {
            LuasPersegi(v);
        });

        btn_KPersegi.setOnClickListener(v -> {
            KelilingPersegi(v);
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void LuasPersegi(View view){
        EditText txt_sisi = findViewById(R.id.txt_sisi);
        EditText txt_HPersegi = findViewById(R.id.txt_HPersegi);

        sisi = Float.parseFloat(txt_sisi.getText().toString());
        luas = sisi * sisi;
        txt_HPersegi.setText(luas.toString());

    }

    public void KelilingPersegi(View view){
        EditText txt_sisi = findViewById(R.id.txt_sisi);
        EditText txt_HPersegi = findViewById(R.id.txt_HPersegi);

        sisi = Float.parseFloat(txt_sisi.getText().toString());
        keliling = 4 * sisi;
        txt_HPersegi.setText(keliling.toString());
    }

}