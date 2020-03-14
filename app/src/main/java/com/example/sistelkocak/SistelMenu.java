package com.example.sistelkocak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class SistelMenu extends AppCompatActivity {

    CardView Dbm,Grafik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistel_menu);

        Dbm = findViewById(R.id.kalkulator);
        Grafik = findViewById(R.id.grafik);

        Dbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SistelMenu.this, KalkulatorMenu.class);
                startActivity(intent);
            }
        });

        Grafik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SistelMenu.this, GrafikSignal.class);
                startActivity(intent);
            }
        });

    }
}
