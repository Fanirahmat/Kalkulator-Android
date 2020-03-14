package com.example.sistelkocak;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Daya extends AppCompatActivity {

    TextInputEditText volt, arus;
    TextView daya;
    Button konversi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daya);

        volt = findViewById(R.id.volt);
        arus = findViewById(R.id.arus);
        daya = findViewById(R.id.hasil);
        konversi = findViewById(R.id.konversi);

        konversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!volt.getText().toString().isEmpty() && !arus.getText().toString().isEmpty()) {
                    setHasil();
                } else {
                    daya.setText("Column must Required");
                }

            }
        });


    }

    private void setHasil() {
        String tegangan = volt.getText().toString();
        String ampere = arus.getText().toString();
        int v = Integer.parseInt(tegangan);
        int a = Integer.parseInt(ampere);

        daya.setText(v * a + " Watt");
    }
}
