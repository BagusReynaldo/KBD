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

public class PersegiPanjang extends AppCompatActivity {

    Float panjang, lebar, luas, keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_persegi_panjang);

        Button btn_LPPanjang = findViewById(R.id.btn_LPPanjang);
        Button btn_KPPanjang = findViewById(R.id.btn_KPPanjang);

        btn_LPPanjang.setOnClickListener(v -> {
            LuasPP(v);
        });

        btn_KPPanjang.setOnClickListener(v -> {
            KelilingPP(v);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void LuasPP(View view){
        EditText txt_panjang = findViewById(R.id.txt_panjang);
        EditText txt_lebar = findViewById(R.id.txt_lebar);
        EditText txt_HPPanjang = findViewById(R.id.txt_HPPanjang);
        panjang = Float.parseFloat(txt_panjang.getText().toString());
        lebar = Float.parseFloat(txt_lebar.getText().toString());
        luas = panjang * lebar;
        txt_HPPanjang.setText(luas.toString());


    }
    public void KelilingPP(View view){
        EditText txt_panjang = findViewById(R.id.txt_panjang);
        EditText txt_lebar = findViewById(R.id.txt_lebar);
        EditText txt_HPPanjang = findViewById(R.id.txt_HPPanjang);

        panjang = Float.parseFloat(txt_panjang.getText().toString());
        lebar = Float.parseFloat(txt_lebar.getText().toString());
        keliling = (panjang * 2) + (lebar * 2);
        txt_HPPanjang.setText(keliling.toString());
    }
}