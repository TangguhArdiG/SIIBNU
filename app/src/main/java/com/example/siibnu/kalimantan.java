package com.example.siibnu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kalimantan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalimantan);
    }
    public void kalbar(View view) {
        Intent tangguh = new Intent(kalimantan.this, kalbar.class);
        startActivity(tangguh);
    }

    public void kalteng(View view) {
        Intent tangguh = new Intent(kalimantan.this, kalteng.class);
        startActivity(tangguh);
    }

    public void kalsel(View view) {
        Intent tangguh = new Intent(kalimantan.this, kalsel.class);
        startActivity(tangguh);
    }

    public void kaltim(View view) {
        Intent tangguh = new Intent(kalimantan.this, kaltim.class);
        startActivity(tangguh);
    }

    public void kalut(View view) {
        Intent tangguh = new Intent(kalimantan.this, kalut.class);
        startActivity(tangguh);
    }
}