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

public class Lingkaran extends AppCompatActivity {

    Float ruas, luas, keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lingkaran);

        Button btn_LLingkaran = findViewById(R.id.btn_LLingkaran);
        Button btn_KLingkaran = findViewById(R.id.btn_KLingkaran);

        btn_LLingkaran.setOnClickListener(v -> {
            LuasLingkaran(v);
        });

        btn_KLingkaran.setOnClickListener(v -> {
            KelilingLingkaran(v);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    public void LuasLingkaran(View view){
        EditText txt_ruas = findViewById(R.id.txt_ruas);
        EditText txt_HLingkaran = findViewById(R.id.txt_HLingkaran);

        ruas = Float.parseFloat(txt_ruas.getText().toString());
        luas = (float) (Math.PI * ruas * ruas);
        txt_HLingkaran.setText(luas.toString());
    }

    public void KelilingLingkaran(View view){
        EditText txt_ruas = findViewById(R.id.txt_ruas);
        EditText txt_HLingkaran = findViewById(R.id.txt_HLingkaran);

        ruas = Float.parseFloat(txt_ruas.getText().toString());
        keliling = (float) (2 * Math.PI * ruas);
        txt_HLingkaran.setText(keliling.toString());
    }

}