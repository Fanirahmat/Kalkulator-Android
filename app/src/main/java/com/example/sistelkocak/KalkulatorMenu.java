package com.example.sistelkocak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class KalkulatorMenu extends AppCompatActivity {

    CardView daya, dbm, dbw, loss, gain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_menu);

        daya = findViewById(R.id.daya);
        dbm = findViewById(R.id.dbm);
        dbw = findViewById(R.id.dbw);
        loss = findViewById(R.id.loss);
        gain = findViewById(R.id.gain);

        daya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KalkulatorMenu.this, Daya.class);
                startActivity(intent);
            }
        });

        dbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KalkulatorMenu.this, DBm.class);
                startActivity(intent);
            }
        });

        dbw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KalkulatorMenu.this, DBw.class);
                startActivity(intent);
            }
        });

        loss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KalkulatorMenu.this, Loss.class);
                startActivity(intent);
            }
        });

        gain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KalkulatorMenu.this, Gain.class);
                startActivity(intent);
            }
        });
    }
}
