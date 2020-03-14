package com.example.sistelkocak;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Gain extends AppCompatActivity {

    TextInputEditText input, output;
    TextView hasil;
    Button konversi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gain);

        input = findViewById(R.id.input);
        output = findViewById(R.id.output);
        hasil = findViewById(R.id.hasil);
        konversi = findViewById(R.id.konversi);

        konversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().toString().isEmpty() && !output.getText().toString().isEmpty()) {
                    setHasil();
                } else {
                    hasil.setText("Both of Column must Required");
                }
            }
        });
    }

    private void setHasil() {

        int mIn = Integer.parseInt(input.getText().toString());
        int mOut = Integer.parseInt(output.getText().toString());

        double mhasil = 10 * (Math.log10(mOut / mIn));

        hasil.setText(((int) mhasil) + " Db");
    }
}
