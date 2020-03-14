package com.example.sistelkocak;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DBw extends AppCompatActivity {

    TextView mili, watt;
    TextInputEditText dayaM, dayaW;
    Button hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbw);

        mili = findViewById(R.id.mili);
        watt = findViewById(R.id.watt);
        dayaM = findViewById(R.id.daya2);
        dayaW = findViewById(R.id.daya1);
        hasil = findViewById(R.id.konversi);

        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!dayaW.getText().toString().isEmpty() && dayaM.getText().toString().isEmpty()) {
                    dayaWatt();
                    mili.setText("");
                } else if (!dayaM.getText().toString().isEmpty() && dayaW.getText().toString().isEmpty()) {
                    dayaMili();
                    watt.setText("");
                } else if (!dayaW.getText().toString().isEmpty() && !dayaM.getText().toString().isEmpty()) {
                    dayaWatt();
                    dayaMili();
                } else {
                    Toast.makeText(DBw.this, "Column must Required", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void dayaWatt() {

        String daya2 = dayaW.getText().toString();

        int Watt = Integer.parseInt(daya2);
        double log = Math.log10(Watt);
        watt.setText(((int) (10 * log)) + " DBw");
    }

    private void dayaMili() {

        String daya1 = dayaM.getText().toString();

        int Mili = Integer.parseInt(daya1);

        mili.setText(Mili - 30 + " DBw");
    }
}
