package com.example.sistelkocak;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DBm extends AppCompatActivity {

    TextView mili, watt;
    TextInputEditText dayaM, dayaW;
    Button hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbm);

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
                    Toast.makeText(DBm.this, "Column must Required", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void dayaMili() {

        String daya2 = dayaM.getText().toString();

        int dayaMili = Integer.parseInt(daya2);
        double log = Math.log10(dayaMili);
        mili.setText(((int) (10 * log)) + " DBm");
    }

    private void dayaWatt() {

        String daya1 = dayaW.getText().toString();

        int dayaWatt = Integer.parseInt(daya1);

        watt.setText(dayaWatt + 30 + " DBm");
    }

}
