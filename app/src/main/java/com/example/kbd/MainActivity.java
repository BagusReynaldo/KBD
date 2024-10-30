package com.example.kbd;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btn_segitiga = findViewById(R.id.btn_segitiga);
        Button btn_lingkaran = findViewById(R.id.btn_lingkaran);
        Button btn_persegi = findViewById(R.id.btn_persegi);
        Button btn_persegipanjang = findViewById(R.id.btn_persegipanjang);

        btn_segitiga.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Segitiga.class);
            startActivity(intent);
        });

        btn_lingkaran.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Lingkaran.class);
            startActivity(intent);
        });

        btn_persegi.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Persegi.class);
            startActivity(intent);
        });
        btn_persegipanjang.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PersegiPanjang.class);
            startActivity(intent);
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}