package com.example.kalkulatorbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btntambah,btnkurang,btnkali,btnbagi;
    EditText angka01,angka02;
    TextView hasilperhitungan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angka01=findViewById(R.id.angka1);
        angka02=findViewById(R.id.angka2);
        hasilperhitungan=findViewById(R.id.hasiloperasi);
        btntambah=findViewById(R.id.tbltambah);

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float ang1=Float.parseFloat(String.valueOf(angka01.getText()));
                float ang2=Float.parseFloat(String.valueOf(angka02.getText()));
                float hasil=(ang1+ang2);
                hasilperhitungan.setText(""+hasil);
            }
        });

        btnkurang=findViewById(R.id.tblkurang);

        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float ang1=Float.parseFloat(String.valueOf(angka01.getText()));
                float ang2=Float.parseFloat(String.valueOf(angka02.getText()));
                float hasil=(ang1-ang2);
                hasilperhitungan.setText(""+hasil);
            }
        });

        btnkali=findViewById(R.id.tblkali);

        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float ang1=Float.parseFloat(String.valueOf(angka01.getText()));
                float ang2=Float.parseFloat(String.valueOf(angka02.getText()));
                float hasil=(ang1*ang2);
                hasilperhitungan.setText(""+hasil);
            }
        });

        btnbagi=findViewById(R.id.tblbagi);

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float ang1=Float.parseFloat(String.valueOf(angka01.getText()));
                float ang2=Float.parseFloat(String.valueOf(angka02.getText()));
                float hasil=(ang1/ang2);
                hasilperhitungan.setText(""+hasil);
            }
        });

    }
}