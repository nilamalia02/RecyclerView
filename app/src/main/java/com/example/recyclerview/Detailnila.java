package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Detailnila extends AppCompatActivity {
//menambahkan data untuk di insert setelah onclick
    TextView txtNim, txtNama, txtGol, txtAngkatan, txtTtl, txtKelamin, txtEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailnila);

        txtNim = findViewById(R.id.txtNim);
        txtNama = findViewById(R.id.txtNama);
        txtGol = findViewById(R.id.txtGol);
        txtAngkatan = findViewById(R.id.txtAngkatan);
        txtTtl = findViewById(R.id.txtTtl);
        txtKelamin = findViewById(R.id.txtKelamin);
        txtEmail = findViewById(R.id.txtEmail);

        //memanggil data dari nila
        nila Nila = getIntent().getParcelableExtra("nila");
        txtNim.setText(Nila.getNim());
        txtNama.setText(Nila.getNama());
        txtGol.setText(Nila.getGol());
        txtAngkatan.setText(Nila.getAngkatan());
        txtTtl.setText(Nila.getTtl());
        txtKelamin.setText(Nila.getKelamin());
        txtEmail.setText(Nila.getEmail());


    }
}
